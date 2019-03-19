package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_2 extends AI {
    
    public AI_2() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "20", Pattern.compile("^20[0-9]{2}") );          // AI #17        
        super.matchers.put( "21", Pattern.compile("^21(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "21eol", Pattern.compile("^21(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "22", Pattern.compile("^22(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "22eol", Pattern.compile("^22(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "240", Pattern.compile("^240(.){1,30}[%\\x1D]") ); // AI #10
        super.matchers.put( "240eol", Pattern.compile("^240(.){1,30}$") );     // AI #10 (eol)
        super.matchers.put( "241", Pattern.compile("^241(.){1,30}[%\\x1D]") ); // AI #10
        super.matchers.put( "241eol", Pattern.compile("^241(.){1,30}$") );     // AI #10 (eol)
        super.matchers.put( "242", Pattern.compile("^242\\d{1,6}[%\\x1D]") ); // AI #10
        super.matchers.put( "242eol", Pattern.compile("^242\\d{1,6}$") );     // AI #10 (eol)
        super.matchers.put( "243", Pattern.compile("^243(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "243eol", Pattern.compile("^243(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "250", Pattern.compile("^250(.){1,30}[%\\x1D]") ); // AI #10
        super.matchers.put( "250eol", Pattern.compile("^250(.){1,30}$") );     // AI #10 (eol)
        super.matchers.put( "251", Pattern.compile("^251(.){1,30}[%\\x1D]") ); // AI #10
        super.matchers.put( "251eol", Pattern.compile("^251(.){1,30}$") );     // AI #10 (eol)
        super.matchers.put( "253", Pattern.compile() );                        // AI #10
        super.matchers.put( "253eol", Pattern.compile() );                     // AI #10 (eol)
        super.matchers.put( "254", Pattern.compile("^254(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "254eol", Pattern.compile("^254(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "255", Pattern.compile("255\\d{14,25}[%\\x1D]") ); // AI #10
        super.matchers.put( "255eol", Pattern.compile("255\\d{14,25}$") );     // AI #10 (eol)      
               
    }
    
    public Object parse17(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "USE BY OR EXPIRY");
        output.put("ai", element.substring(0, 2) );
        output.put("year", Integer.parseInt( element.substring(2, 4) ));
        output.put("month", Integer.parseInt( element.substring(4, 6) ));
        output.put("day", Integer.parseInt( element.substring(6, 8) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse10(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "BATCH/LOT");
        output.put("ai", element.substring(0, 2) );
        output.put("number", element.substring(2) );
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse10eol(String element) {
        
        return ( parse10(element) );
        
    }
}