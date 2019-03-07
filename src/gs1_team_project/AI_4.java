package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_4 extends AI {
    
    public AI_4() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "10", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p400 = Pattern.compile("^400(.){1,30}[%\\x1D]"); // AI #400
        Pattern p400eol = Pattern.compile("^400(.){1,30}$"); //AI #400eol
        Pattern p401 = Pattern.compile("^401(.){1,30}[%\\x1D]"); // AI #400
        Pattern p401eol = Pattern.compile("^401(.){1,30}$");
        Pattern p402 = Pattern.compile("^402[0-9]{17}");
        Pattern p402eol = Pattern.compile("^402[0-9]$");
        Pattern p403 = Pattern.compile("^403(.){1,30}[%\\x1D]");
        Pattern p403eol = Pattern.compile("^403(.){1,30}$");
        Pattern p410 = Pattern.compile("^410[0-9]{13}");
        Pattern p411 = Pattern.compile("^411[0-9]{13}");
        Pattern p412 = Pattern.compile("^412[0-9]{13}");
        Pattern p413 = Pattern.compile("^413[0-9]{13}");
        Pattern p414 = Pattern.compile("^414[0-9]{13}");
        Pattern p415 = Pattern.compile("^415[0-9]{13}");
        Pattern p416 = Pattern.compile("^416[0-9]{13}");
        Pattern p420 = Pattern.compile("^420(.){1,20}[%\\x1D]");
        Pattern p420eol = Pattern.compile("^420(.){1,20}$");
        Pattern p421 = Pattern.compile("^421[0-9]{3}(.){1,9}[%\\x1D]");
        Pattern p421eol = Pattern.compile("^421[0-9]{3}(.){1,9}$");
        Pattern p422 = Pattern.compile("^422[0-9]{3}[%\\x1D]");
        Pattern p422eol = Pattern.compile("^422[0-9]{3}$");
        Pattern p423 = Pattern.compile("^423[0-9]{3}[0-9]{1,12}[%\\x1D]");
        Pattern p423eol = Pattern.compile("^423[0-9]{3}[0-9]{1,12}$");
        Pattern p424 = Pattern.compile("^424[0-9]{3}[%\\x1D]");
        Pattern p424eol = Pattern.compile("^424[0-9]{3}$");
        Pattern p425 = Pattern.compile("^425[0-9]{3}[0-9]{1,12}[%\\x1D]");
        Pattern p425eol = Pattern.compile("^425[0-9]{3}[0-9]{1,12}$");
        Pattern p426 = Pattern.compile("^426[0-9]{3}[%\\x1D]");
        Pattern p426eol = Pattern.compile("^426[0-9]{3}$");
        Pattern p427 = Pattern.compile("^427(.){1,3}[%\\x1D]");
        Pattern p427eol = Pattern.compile("^427(.){1,3}$");
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