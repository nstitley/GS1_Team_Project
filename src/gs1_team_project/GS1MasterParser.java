package gs1_team_project;

import java.lang.reflect.Constructor;
import org.json.simple.JSONValue;
import java.util.ArrayList;
import java.util.HashMap;

public class GS1MasterParser {

        /* TOP-LEVEL PARSE METHOD */

        public String parse(String code) {

        /* Create empty GS1 data collections */

        ArrayList<Object> data = new ArrayList<>();
        HashMap<String, Object> results = null;

        /* Continue parsing until entire GS1 code has been processed */

        while ( !code.isEmpty() ) {

            results = null;

            /* Sample first digit in code */

            char d = code.charAt(0);
            System.out.println("Code Digit " + d + " Found");

            /* Is digit valid? */

            if ((d >= '0') && (d <= '9')) {

                try {

                    /* If so, instantiate the corresponding matcher/parser collection */

                    Class c = Class.forName("edu.jsu.mcis.plinkoproto.GS1_" + d + "X");
                    Constructor constructor = c.getConstructor();
                    AI p = (AI)(constructor.newInstance());

                    /* Delegate match/parse to collection; capture results */

                    results = (HashMap)(p.parse(code));

                }
                catch (Exception e) {System.err.println("GS1 Class Exception: " + e.toString());}

            }

            if (results != null) {

                /* If valid results were returned, add to array */

                data.add(results);

                /* Strip parsed element string from beginning of code */

                String element = (String)results.get("element");
                code = code.substring(element.length()).trim();

            }

            /* If element string could not be identified, abort the parse */

            else {
                break;
            }

        }

        /* Return array of parsed GS1 data as a JSON string */

        return(JSONValue.toJSONString(data));

    }   
}


/*
RULES AND RELATED

________________

Related AIs (These are all the AIs affected by the following rules.)
00      01      01w0    01w9    02      02w9    10      11      12      13      15
16      17      20      21      22      240     241     242     243     250     251
254     255     3nnn*   3nnn**  30      37      337n    390n    391n    392n    393n
394n    414     415     420     421     422     423     424     425     426     427
703(s)  723s    710     711     712     713     714     7001    7002    7003    7004
7005    7006    7007    7008    7009    7010    7020    7021    7022    8001    8005
8006*** 8006w9  8007    8008    8009    8011    8012    8017    8018    8019    8020
8026    8026w9  8111    8200
________________

--w0 means that N1 in that code is equal to 0
--w9 means that N1 in that code is equal to 9
3nnn* can mean 31nn, 32nn, 35nn, or 36nn
3nnn** can mean 33nn, 34nn, 35nn, or 36nn
If 8006*** is used with ITIP, the optional AIs on all individual pieces of the 
    trade item SHALL be identical. (I've no clue what this means...)
        So, 8006 is the ITIP or GCTIN, so if 8006 is used as an ITIP instead 
        of a GCTIN, if there are optional AIs used anywhere, they will be identical.
________________

INVALID PAIRS (These pairs cannot be in the same code or the program is terminated.)
    All are equal to FALSE
01 && 01
01 && 02
01 && 37
01 && 255
420 && 421
422 && 426
423 && 426
424 && 426
425 && 426
390n && 391n
390n && 394n
390n && 8111
393n && 393n
394n && 8111
8006 && 01
8006 && 37
8018 && 8017
8026 && 02
8026 && 8006
________________

MANDATORY PAIRS (These pairs must be in the code or the program is terminated.)
    All are equal to TRUE
01w0 && (30 || 3nnn*)
01w9 && (30 || 3nnn* || 8001)
02w9 && (30 || 3nnn* || 8001)
01w9 && 242
02 && (00 && 37)
10 && (01 ^ 02 ^ 8006 ^ 8026)***
11 && (01 ^ 02 ^ 8006 ^ 8026)***
13 && (01 ^ 02 ^ 8006 ^ 8026)***
15 && (01 ^ 02 ^ 8006 ^ 8026)***
16 && (01 ^ 02 ^ 8006 ^ 8026)***
17 && (01 ^ 02 ^ 8006 ^ 8026)***
12 && (8020 && 415)
17 && 255
20 && (01 ^ 02 ^ 8006 ^ 8026)***
21 && (01 ^ 8006***)
22 && 01
240 && (01 ^ 02 ^ 8006 ^ 8026)***
241 && (01 ^ 02 ^ 8006 ^ 8026)***
242 && (01w9 ^ 02w9 ^ 8006w9 ^ 8026w9)***
243 && 01
250 && (01 ^ 8006***) && 21
251 && (01 ^ 8006***)
254 && 414
30 && (01 ^ 02)
3nnn* && (01 ^ 02)
3nnn** && (00 ^ 01)
337n && 01
37 && 00 && (02 ^ 8026)
390n && 8020 && 415
390n && 255
391n && 8020 && 415
392n && 01 && (30 ^ 3nnn*)
393n && 01 && (30 ^ 3nnn*)
394n && 255
403 && 00
415 && 8020
422 && (01 ^ 02 ^ 8006 ^ 8026)***
423 && (01 ^ 02)
424 && (01 ^ 02)
425 && (01 ^ 02)
426 && (01 ^ 02)
427 && (01 ^ 02) && 422
7001 && (01 ^ 02 ^ 8006 ^ 8026)***
7002 && (01 ^ 02)
7003 && (01 ^ 02)
7004 && (01 ^ 10)
7005 && (01 ^ 02)
7006 && (01 ^ 02)
7007 && (01 ^ 02)
7008 && (01 ^ 02)
7009 && (01 ^ 02)
7010 && (01 ^ 02)
703(s) && (01 ^ 02)
710 && 01
711 && 01
712 && 01
713 && 01
714 && 01
7020 && (01 ^ 8006***) && 416
7021 && (01 ^ 8006***)
7022 && (01 ^ 8006***) && 7021
723s && (01 ^ 8004)
8001 && 01
8005 && (01 ^ 02)
8007 && 8020 && 415
8008 && (01 ^ 02)
8009 && (01 ^ 00)
8011 && 8010
8012 && (01 ^ 8006***)
8019 && (8017 ^ 8018)
8020 && 415
8026 && 00 && 37
8111 && 255
8200 && 01
________________

*/