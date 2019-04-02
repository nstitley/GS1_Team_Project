package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_7 extends AI {
    
    public AI_7() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "7001", Pattern.compile("^7001[0-9]{13}") );
        super.matchers.put( "7002", Pattern.compile("^8007(.){1,30}[%\\x1D]") );
        super.matchers.put( "7002eol", Pattern.compile("^8007(.){1,30}$") );
        super.matchers.put( "7003", Pattern.compile("^7003[0-9]{10}") );
        super.matchers.put( "7004", Pattern.compile("7004\\d{1,4}[%\\x1D]") );
        super.matchers.put( "7004eol", Pattern.compile("7004\\d{1,4}$") );
        super.matchers.put( "7005", Pattern.compile("^7005(.){1,12}[%\\x1D]") );
        super.matchers.put( "7005eol", Pattern.compile("^7005(.){1,12}$") );
        super.matchers.put( "7006", Pattern.compile("^7006[0-9]{6}") );
        super.matchers.put( "7007", Pattern.compile("7007\\d{6,12}[%\\x1D]") );
        super.matchers.put( "7007eol", Pattern.compile("7007\\d{6,12}$") );
        super.matchers.put( "7008", Pattern.compile("^7008(.){1,3}[%\\x1D]") );
        super.matchers.put( "7008eol", Pattern.compile("^7008(.){1,3}$") );
        super.matchers.put( "7009", Pattern.compile("^7009(.){1,10}[%\\x1D]") );
        super.matchers.put( "7009eol", Pattern.compile("^7009(.){1,10}$") );
        super.matchers.put( "7010", Pattern.compile("^7010(.){1,2}[%\\x1D]") );
        super.matchers.put( "7010eol", Pattern.compile("^7010(.){1,2}$") );
        super.matchers.put( "7020", Pattern.compile("^7020(.){1,20}[%\\x1D]") );
        super.matchers.put( "7020eol", Pattern.compile("^7020(.){1,20}$") );
        super.matchers.put( "7021", Pattern.compile("^7021(.){1,20}[%\\x1D]") );
        super.matchers.put( "7021eol", Pattern.compile("^7021(.){1,20}$") );
        super.matchers.put( "7022", Pattern.compile("^7022(.){1,20}[%\\x1D]") );
        super.matchers.put( "7022eol", Pattern.compile("^7022(.){1,20}$") );
        super.matchers.put( "7023", Pattern.compile("^7023(.){1,30}[%\\x1D]") );
        super.matchers.put( "7023eol", Pattern.compile("^7023(.){1,30}$") );
        super.matchers.put( "703s", Pattern.compile("^703(.){1, 30}[%\\x1D]") );
        super.matchers.put( "710", Pattern.compile("^710(.){1,20}[%\\x1D]") );
        super.matchers.put( "710eol", Pattern.compile("^710(.){1,20}$") );
        super.matchers.put( "711", Pattern.compile("^711(.){1,20}[%\\x1D]") );
        super.matchers.put( "711eol", Pattern.compile("^711(.){1,20}$") );
        super.matchers.put( "712", Pattern.compile("^712(.){1,20}[%\\x1D]") );
        super.matchers.put( "712eol", Pattern.compile("^712(.){1,20}$") );
        super.matchers.put( "713", Pattern.compile("^713(.){1,20}[%\\x1D]") );
        super.matchers.put( "713eol", Pattern.compile("^713(.){1,20}$") );
        super.matchers.put( "714", Pattern.compile("^714(.){1,20}[%\\x1D]") );
        super.matchers.put( "714eol", Pattern.compile("^714(.){1,20}$") );
        super.matchers.put( "723s", Pattern.compile("^723(.){1, 32}[%\\x1D]") );
        
    }

    public Object parse7001(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NSN");
        output.put("ai", element.substring(0, 4) );
        output.put("classification", Integer.parseInt( element.substring(4, 8) ));
        output.put("country", Integer.parseInt( element.substring(8, 10) ));
        output.put("number", Integer.parseInt( element.substring(10) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7001eol(String element) {
        
        return ( parse7001(element) );
        
    }
    
    public Object parse7002(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "MEAT CUT");
        output.put("ai", element.substring(0, 4) );
        output.put("classification", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7002eol(String element) {
        
        return ( parse7002(element) );
        
    }
    
    public Object parse7003(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "EXPIRY TIME");
        output.put("ai", element.substring(0, 4) );
        output.put("year", Integer.parseInt( element.substring(4, 6) ));
        output.put("month", Integer.parseInt( element.substring(6, 8) ));
        output.put("day", Integer.parseInt( element.substring(8, 10) ));
        output.put("hour", Integer.parseInt( element.substring(10, 12) ));
        output.put("minute", Integer.parseInt( element.substring(12) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7003eol(String element) {
        
        return ( parse7003(element) );
        
    }
    
    public Object parse7004(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "ACTIVE POTENCY");
        output.put("ai", element.substring(0, 4) );
        output.put("active potency", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7004eol(String element) {
        
        return ( parse7004(element) );
        
    }
    
    public Object parse7005(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CATCH AREA");
        output.put("ai", element.substring(0, 4) );
        output.put("catch area", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7005eol(String element) {
        
        return ( parse7005(element) );
        
    }
    
    public Object parse7006(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "FIRST FREEZE DATE");
        output.put("ai", element.substring(0, 4) );
        output.put("year", Integer.parseInt( element.substring(4, 6) ));
        output.put("month", Integer.parseInt( element.substring(6, 8) ));
        output.put("day", Integer.parseInt( element.substring(8) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7007(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HARVEST DATE");
        output.put("ai", element.substring(0, 4) );
        output.put("start year", Integer.parseInt( element.substring(4, 6) ));
        output.put("start month", Integer.parseInt( element.substring(6, 8) ));
        output.put("start day", Integer.parseInt( element.substring(8, 10) ));
        output.put("end year", Integer.parseInt( element.substring(10, 12) ));
        output.put("end month", Integer.parseInt( element.substring(12, 14) ));
        output.put("end day", Integer.parseInt( element.substring(14, 16) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7007eol(String element) {
        
        return ( parse7007(element) );
        
    }
    
    public Object parse7008(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AQUATIC SPECIES");
        output.put("ai", element.substring(0, 4) );
        output.put("species", Integer.parseInt( element.substring(4, 8) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7008eol(String element) {
        
        return ( parse7008(element) );
        
    }
    
    public Object parse7009(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "FISHING GEAR TYPE");
        output.put("ai", element.substring(0, 4) );
        output.put("fishing gear type", Integer.parseInt( element.substring(4, 14) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7009eol(String element) {
        
        return ( parse7009(element) );
        
    }
    
    public Object parse7010(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PROD METHOD");
        output.put("ai", element.substring(0, 4) );
        output.put("production method", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7010eol(String element) {
        
        return ( parse7010(element) );
        
    }
    
    public Object parse7020(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "REFURB LOT");
        output.put("ai", element.substring(0, 4) );
        output.put("lot id", Integer.parseInt( element.substring(4, 24) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7020eol(String element) {
        
        return ( parse7020(element) );
        
    }
    
    public Object parse7021(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "FUNC STAT");
        output.put("ai", element.substring(0, 4) );
        output.put("functional status", Integer.parseInt( element.substring(4, 24) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7021eol(String element) {
        
        return ( parse7021(element) );
        
    }
    
    public Object parse7022(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "REV STAT");
        output.put("ai", element.substring(0, 4) );
        output.put("revision status", Integer.parseInt( element.substring(4, 24) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7022eol(String element) {
        
        return ( parse7022(element) );
        
    }
    
    public Object parse7023(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GIAI - ASSEMBLY");
        output.put("ai", element.substring(0, 4) );
        output.put("giai", Integer.parseInt( element.substring(4, 34) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse7023eol(String element) {
        
        return ( parse7023(element) );
        
    }
    
    public Object parse710(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NHRN PZN");
        output.put("ai", element.substring(0, 3) );
        output.put("nhrn", Integer.parseInt( element.substring(3, 23) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse710eol(String element) {
        
        return ( parse710(element) );
        
    }
    
    public Object parse711(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NHRN CIP");
        output.put("ai", element.substring(0, 3) );
        output.put("nhrn", Integer.parseInt( element.substring(3, 23) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse711eol(String element) {
        
        return ( parse711(element) );
        
    }
    
    public Object parse712(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NHRN CN");
        output.put("ai", element.substring(0, 3) );
        output.put("nhrn", Integer.parseInt( element.substring(3, 23) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse712eol(String element) {
        
        return ( parse712(element) );
        
    }
    
    public Object parse713(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NHRN DRN");
        output.put("ai", element.substring(0, 3) );
        output.put("nhrn", Integer.parseInt( element.substring(3, 23) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse713eol(String element) {
        
        return ( parse713(element) );
        
    }
    
    public Object parse714(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NHRN AIM");
        output.put("ai", element.substring(0, 3) );
        output.put("nhrn", Integer.parseInt( element.substring(3, 23) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse714eol(String element) {
        
        return ( parse714(element) );
        
    }
    
    public Object parse703s(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PROCESSOR # s");
        output.put("ai", element.substring(0, 4) );
        output.put("iso country code", Integer.parseInt( element.substring(4, 7) ));
        output.put("number of processor", Integer.parseInt( element.substring(7, 37) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse723s(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CERT # s");
        output.put("ai", element.substring(0, 4) );
        output.put("certification scheme", Integer.parseInt( element.substring(4, 6) ));
        output.put("certification reference", Integer.parseInt( element.substring(6, 36) ));
        output.put("element", element);
        
        return output;
        
    }
    
} 