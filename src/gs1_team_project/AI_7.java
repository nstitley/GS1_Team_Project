package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_7 extends AI {
    
    public AI_7() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "10", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p7001 = Pattern.compile("^7001[0-9]{13}");
        Pattern p7002 = Pattern.compile("^8007(.){1,30}[%\\x1D]");
        Pattern p7002eol = Pattern.compile("^8007(.){1,30}$");
        Pattern p7003 = Pattern.compile("^7003[0-9]{10}");
        Pattern p7004 = Pattern.compile("7004\\d{1,4}[%\\x1D]");
        Pattern p7004eol = Pattern.compile("7004\\d{1,4}$");
        Pattern p7005 = Pattern.compile("^7005(.){1,12}[%\\x1D]");
        Pattern p7005eol = Pattern.compile("^7005(.){1,12}$");
        Pattern p7006 = Pattern.compile("^7006[0-9]{6}");
        Pattern p7007 = Pattern.compile("7007\\d{6,12}[%\\x1D]");
        Pattern p7007eol = Pattern.compile("7007\\d{6,12}$");
        Pattern p7008 = Pattern.compile("^7008(.){1,3}[%\\x1D]");
        Pattern p7008eol = Pattern.compile("^7008(.){1,3}$");
        Pattern p7009 = Pattern.compile("^7009(.){1,10}[%\\x1D]");
        Pattern p7009eol = Pattern.compile("^7009(.){1,10}$");
        Pattern p7010 = Pattern.compile("^7010(.){1,2}[%\\x1D]");
        Pattern p7010eol = Pattern.compile("^7010(.){1,2}$");
        Pattern p7020 = Pattern.compile("^7020(.){1,20}[%\\x1D]");
        Pattern p7020eol = Pattern.compile("^7020(.){1,20}$");
        Pattern p7021 = Pattern.compile("^7021(.){1,20}[%\\x1D]");
        Pattern p7021eol = Pattern.compile("^7021(.){1,20}$");
        Pattern p7022 = Pattern.compile("^7022(.){1,20}[%\\x1D]");
        Pattern p7022eol = Pattern.compile("^7022(.){1,20}$");
        Pattern p7023 = Pattern.compile("^7023(.){1,30}[%\\x1D]");
        Pattern p7023eol = Pattern.compile("^7023(.){1,30}$");
        //Pattern p703s = Pattern.compile("shrugs");
        Pattern p710 = Pattern.compile("^710(.){1,20}[%\\x1D]");
        Pattern p710eol = Pattern.compile("^710(.){1,20}$");
        Pattern p711 = Pattern.compile("^711(.){1,20}[%\\x1D]");
        Pattern p711eol = Pattern.compile("^711(.){1,20}$");
        Pattern p712 = Pattern.compile("^712(.){1,20}[%\\x1D]");
        Pattern p712eol = Pattern.compile("^712(.){1,20}$");
        Pattern p713 = Pattern.compile("^713(.){1,20}[%\\x1D]");
        Pattern p713eol = Pattern.compile("^713(.){1,20}$");
        Pattern p714 = Pattern.compile("^714(.){1,20}[%\\x1D]");
        Pattern p714eol = Pattern.compile("^714(.){1,20}$");
        //Pattern p... = Pattern.compile("I literally can't even");
        //Pattern p723s = Pattern.compile("no clue");
        
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