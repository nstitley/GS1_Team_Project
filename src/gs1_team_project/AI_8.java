package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_8 extends AI {
    
    public AI_8() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "10", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p8001 = Pattern.compile("^8001[0-9]{14}");
        Pattern p8002 = Pattern.compile("^8002(.){1,20}[%\\x1D]");
        Pattern p8002eol = Pattern.compile("^8002(.){1,20}$");
        Pattern p8003 = Pattern.compile("8003\\d{15,30}[%\\x1D]");
        Pattern p8003eol = Pattern.compile("8003\\d{15,30}$");
        Pattern p8004 = Pattern.compile("^8004(.){1,30}[%\\x1D]");
        Pattern p8004eol = Pattern.compile("^8004(.){1,30}$");
        Pattern p8005 = Pattern.compile("^8005[0-9]{6}");
        Pattern p8006 = Pattern.compile("^8006[0-9]{18}");
        Pattern p8007 = Pattern.compile("^8007(.){1,34}[%\\x1D]");
        Pattern p8007eol = Pattern.compile("^8007(.){1,34}$");
        Pattern p8008 = Pattern.compile("8008\\d{9,12}[%\\x1D]");
        Pattern p8008eol = Pattern.compile("8008\\d{9,12}$");
        Pattern p8009 = Pattern.compile("^8009(.){1,50}[%\\x1D]");
        Pattern p8009eol = Pattern.compile("^8009(.){1,50}$");
        Pattern p8010 = Pattern.compile("^8010(.){1,30}[%\\x1D]");
        Pattern p8010eol = Pattern.compile("^8010(.){1,30}$");
        Pattern p8011 = Pattern.compile("8011\\d{1,12}[%\\x1D]");
        Pattern p8011eol = Pattern.compile("8011\\d{1,12}$");
        Pattern p8012 = Pattern.compile("^8012(.){1,20}[%\\x1D]");
        Pattern p8012eol = Pattern.compile("^8012(.){1,20}$");
        Pattern p8013 = Pattern.compile("^8013(.){1,30}[%\\x1D]");
        Pattern p8013eol = Pattern.compile("^8013(.){1,30}$");
        Pattern p8017 = Pattern.compile("^8017[0-9]{18}");
        Pattern p8018 = Pattern.compile("^8018[0-9]{18}");
        Pattern p8019 = Pattern.compile("8019\\d{1,10}[%\\x1D]");
        Pattern p8019eol = Pattern.compile("8019\\d{1,10}$");
        Pattern p8020 = Pattern.compile("^8020(.){1,25}[%\\x1D]");
        Pattern p8020eol = Pattern.compile("^8020(.){1,25}$");
        Pattern p8110 = Pattern.compile("^8110(.){1,70}[%\\x1D]");
        Pattern p8110eol = Pattern.compile("^8110(.){1,70}$");
        Pattern p8026 = Pattern.compile("^8026[0-9]{18}");
        Pattern p8111 = Pattern.compile("^8111[0-9]{4}");
        Pattern p8112 = Pattern.compile("^8112(.){1,70}[%\\x1D]");
        Pattern p8112eol = Pattern.compile("^8112(.){1,70}$");
        Pattern p8200 = Pattern.compile("^8200(.){1,70}[%\\x1D]");
        Pattern p8200eol = Pattern.compile("^8200(.){1,70}$");
        
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
    
    public Object parse8001(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "DIMENSIONS");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 8) ));
        output.put("length", Integer.parseInt( element.substring(8, 14) ));
        output.put("diameter", Integer.parseInt( element.substring(14, 18) ));
        output.put("winding direction", Integer.parseInt( element.substring(18) ));
        output.put("splices", Integer.parseInt( element.substring(19) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse8002(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CMT NO");
        output.put("ai", element.substring(0, 4) );
        output.put("serial number", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse8002eol(String element) {
        
        return ( parse8002(element) );
        
    }
    
    public Object parse8003(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GRAI");
        output.put("ai", element.substring(0, 4) );
        output.put("prefix", Integer.parseInt( element.substring(4, 12) ));
        output.put("type", Integer.parseInt( element.substring(12, 18) ));
        output.put("digit", Integer.parseInt( element.substring(18) ));
        output.put("serial", Integer.parseInt( element.substring(19) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse8003eol(String element) {
        
        return ( parse8003(element) );
        
    }
    
    public Object parse8004(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GIAI");
        output.put("ai", element.substring(0, 4) );
        output.put("prefix", Integer.parseInt( element.substring(4 ) ));
        output.put("reference", Integer.parseInt( element.substring(4 ) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse8004eol(String element) {
        
        return ( parse8004(element) );
        
    }
    public Object parse8005(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE PER UNIT");
        output.put("ai", element.substring(0, 4) );
        output.put("measure", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse8005eol(String element) {
        
        return ( parse8005(element) );
        
    }
    
    
    
    
    
}