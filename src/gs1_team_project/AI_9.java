package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_9 extends AI {
    
    public AI_9() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "10", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p90 = Pattern.compile("^90(.){1,30}[%\\x1D]");
        Pattern p90eol = Pattern.compile("^90(.){1,30}$");
        Pattern p91 = Pattern.compile("^91(.){1,90}[%\\x1D]");
        Pattern p91eol = Pattern.compile("^91(.){1,90}$");
        Pattern p92 = Pattern.compile("^92(.){1,90}[%\\x1D]");
        Pattern p92eol = Pattern.compile("^92(.){1,90}$");
        Pattern p93 = Pattern.compile("^93(.){1,90}[%\\x1D]");
        Pattern p93eol = Pattern.compile("^93(.){1,90}$");
        Pattern p94 = Pattern.compile("^94(.){1,90}[%\\x1D]");
        Pattern p94eol = Pattern.compile("^94(.){1,90}$");
        Pattern p95 = Pattern.compile("^95(.){1,90}[%\\x1D]");
        Pattern p95eol = Pattern.compile("^95(.){1,90}$");
        Pattern p96 = Pattern.compile("^96(.){1,90}[%\\x1D]");
        Pattern p96eol = Pattern.compile("^96(.){1,90}$");
        Pattern p97 = Pattern.compile("^97(.){1,90}[%\\x1D]");
        Pattern p97eol = Pattern.compile("^97(.){1,90}$");
        Pattern p98 = Pattern.compile("^98(.){1,90}[%\\x1D]");
        Pattern p98eol = Pattern.compile("^98(.){1,90}$");
        Pattern p99 = Pattern.compile("^99(.){1,90}[%\\x1D]");
        Pattern p99eol = Pattern.compile("^99(.){1,90}$");
        
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