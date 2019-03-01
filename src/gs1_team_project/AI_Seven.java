package gs1_team_project;

import java.util.ArrayList;
import java.util.regex.*;

public class AI_Seven {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p7001 = Pattern.compile("^7001[0-9]{13}[%\\x1D]");
        Pattern p7001eol = Pattern.compile("^7001[0-9]{13}$");         
        Pattern p7002 = Pattern.compile("^7002(.){1,30}[%\\x1D]");
        Pattern p7002eol = Pattern.compile("^7002(.){1,30}$");              
        Pattern p7003 = Pattern.compile("^7003[0-9]{10}[%\\x1D]");
        Pattern p7003eol = Pattern.compile("^7003[0-9]{10}$");
        Pattern p7004 = Pattern.compile("^7004[0-9]{1,4}[%\\x1D]");
        Pattern p7004eol = Pattern.compile("^7004[0-9]{1,4}$");
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]");
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}$");
        Pattern p7006 = Pattern.compile("^7006[0-9]{6}[%\\x1D]");
        Pattern p7006eol = Pattern.compile("^7006[0-9]{6}$");
        
        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p7001);
        patterns.add(p7001eol);
        patterns.add(p7002);
        patterns.add(p7002eol);
        
        /* Loop until input is fully processed, or an unknown code is found */
        
        while (!code.isEmpty() && matched) {
            
            matched = false;
            
            /* Run input string against recognized pattern matchers */
            
            for (Pattern p : patterns) {
                
                /* Run next pattern matcher */
                Matcher m = p.matcher(code);
                
                /* Was it a match? */
                if (m.find()) {
                    
                    /* Flip "matched" flag */
                    matched = true;

                    /* Get string offset of the end of the matched code */
                    int end = m.end();

                    /* Print matched code */
                    System.out.println("Found Code: " + m.group());

                    /* Strip matched code from the input string */
                    code = code.substring(end).trim();

                }

            }
            
        }
        
        /* Print original input string */
        
        System.out.println("\nFinished Parsing: " + input);
        
        /* Replace this with a JSON string containing the parsed code data */
        
        return ( "" );
        
    }
}
