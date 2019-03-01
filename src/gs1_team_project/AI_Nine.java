package gs1_team_project;

import java.util.ArrayList;
import java.util.regex.*;

public class AI_Nine {
    
    public String parse(String input) {
        
        String code = input;
        boolean matched = true;
        
        ArrayList<Pattern> patterns = new ArrayList<>();
        
        /* Echo input string */
        
        System.out.println("Parsing: " + input + "\n");
        
        /* Create precompiled pattern matchers (for AIs 01, 17, and 10) */
        
        Pattern p90 = Pattern.compile("^00[0-9]{18}");         
        Pattern p90eol = Pattern.compile("^01[0-9]{14}");              
        Pattern p9199 = Pattern.compile("^00[0-9]{18}");         
        Pattern p9199eol = Pattern.compile("^01[0-9]{14}");
        
        /* Add pattern matchers to iterable collection */
        
        patterns.add(p90);
        patterns.add(p90eol);
        patterns.add(p9199);
        
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
