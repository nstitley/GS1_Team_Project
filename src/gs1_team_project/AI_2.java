package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_2 extends AI {
    
    public AI_2() {
        
        super();
        
        super.matchers = new HashMap<>();
<<<<<<< HEAD
       
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
        super.matchers.put( "17", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "10", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "10eol", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p20 = Pattern.compile("^20[0-9]{2}");
        Pattern p21 = Pattern.compile("^21(.){1,20}[%\\x1D]");
        Pattern p21eol = Pattern.compile("^21(.){1,20}$");
        Pattern p22 = Pattern.compile("^22(.){1,20}[%\\x1D]");
        Pattern p22eol = Pattern.compile("^22(.){1,20}$");
        Pattern p240 = Pattern.compile("^240(.){1,30}[%\\x1D]");
        Pattern p240eol = Pattern.compile("^240(.){1,30}$");
        Pattern p241 = Pattern.compile("^241(.){1,30}[%\\x1D]");
        Pattern p241eol = Pattern.compile("^241(.){1,30}$");
        Pattern p242 = Pattern.compile("^242\\d{1,6}[%\\x1D]");
        Pattern p242eol = Pattern.compile("^242\\d{1,6}$");
        Pattern p243 = Pattern.compile("^243(.){1,20}[%\\x1D]");
        Pattern p243eol = Pattern.compile("^243(.){1,20}$");
        Pattern p250 = Pattern.compile("^250(.){1,30}[%\\x1D]");
        Pattern p250eol = Pattern.compile("^250(.){1,30}$");
        Pattern p251 = Pattern.compile("^251(.){1,30}[%\\x1D]");
        Pattern p251eol = Pattern.compile("^251(.){1,30}$");
        Pattern p253 = Pattern.compile("^253(.)(14,30)[%\\x1D]");
        Pattern p253eol = Pattern.compile("^253(.)(14,30)$");
        Pattern p254 = Pattern.compile("^254(.){1,20}[%\\x1D]");
        Pattern p254eol = Pattern.compile("^254(.){1,20}$");
        Pattern p255 = Pattern.compile("255\\d{14,25}[%\\x1D]");
        Pattern p255eol = Pattern.compile("255\\d{14,25}$");
        //Pattern p
=======
        
        super.matchers.put( "20", Pattern.compile("^20[0-9]{2}") );          // AI #17        
        super.matchers.put( "21", Pattern.compile("^21(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "21eol", Pattern.compile("^21(.){1,20}$") );     // AI #10 (eol) 
        super.matchers.put( "22", Pattern.compile("^22(.){1,20}[%\\x1D]") );
        super.matchers.put( "22eol", Pattern.compile("^22(.){1,20}$") );
        super.matchers.put( "240", Pattern.compile("^240(.){1,30}[%\\x1D]") );
        super.matchers.put( "240eol", Pattern.compile("240(.){1,30}$") );
        super.matchers.put( "241", Pattern.compile("^241(.){1,30}[%\\x1D]") );
        super.matchers.put( "241eol", Pattern.compile("^241(.){1,30}$") );
        super.matchers.put( "242", Pattern.compile("^242\\d{1,6}[%\\x1D]") );
        super.matchers.put( "242eol", Pattern.compile("^242\\d{1,6}$") );
        super.matchers.put( "243", Pattern.compile("^243(.){1,20}[%\\x1D]") );
        super.matchers.put( "243eol", Pattern.compile("^243(.){1,20}$") );
        super.matchers.put( "250", Pattern.compile("^250(.){1,30}[%\\x1D]") );
        super.matchers.put( "250eol", Pattern.compile("^250(.){1,30}$") );
        super.matchers.put( "251", Pattern.compile("^251(.){1,30}[%\\x1D]") );
        super.matchers.put( "251eol", Pattern.compile("^251(.){1,30}$") );
        super.matchers.put( "253", Pattern.compile("^253[1-9]{13}(.){1,17}[%\\x1D]") );
        super.matchers.put( "253eol", Pattern.compile("^253[1-9]{13}(.){1,17}$") );
        super.matchers.put( "254", Pattern.compile("^254(.){1,20}[%\\x1D]") );
        super.matchers.put( "254eol", Pattern.compile("^254(.){1,20}$") );
        super.matchers.put( "255", Pattern.compile("^255[1-9]{13}[1-9]{1,12}[%\\x1D]") );
        super.matchers.put( "255eol", Pattern.compile("^255[1-9]{13}[1-9]{1,12}$") );
        
>>>>>>> 422d716948df222c52647b32fa87f674e8cb3e90
    }
    
    public Object parse20 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "IPV");
        output.put("ai", element.substring(0,2) );
        output.put("variant", element.substring(2,4) );
        output.put("element", element);
        
        return output;
    }
    public Object parse21 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        output.put("title", "Serial");
        output.put("ai", element.substring(0,2) );
        output.put("number", Integer.parseInt(element.substring(2)) );
        output.put("element", element);
        
        return output;
    }
    public Object parse21eol (String element){
        return (parse21(element));
    }
    public Object parse22 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CPV");
        output.put("ai", element.substring(0,2) );
        output.put("variant", Integer.parseInt(element.substring(2) ) );
        output.put("element", element);
        
        return output;
    }
    public Object parse22eol (String element){
        return (parse22(element));
    }
    public Object parse240 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "Identification");
        output.put("ai", element.substring(0,3) );
        output.put("aid", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse240eol (String element){
        return (parse240(element));
    }
    public Object parse241 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CPN");
        output.put("ai", element.substring(0,3) );
        output.put("number", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse241eol (String element){
        return (parse241(element));
    }
    public Object parse242 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "MTOVN");
        output.put("ai", element.substring(0,3) );
        output.put("number", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse242eol (String element){
        return (parse242(element));
    }
    public Object parse243 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PCN");
        output.put("ai", element.substring(0,3) );
        output.put("number", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse243eol (String element){
        return (parse243(element));
    }
    public Object parse250 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "SecondarySN");
        output.put("ai", element.substring(0,3) );
        output.put("number", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse250eol (String element){
        return (parse250(element));
    }
    public Object parse251 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "Source Entity Reference");
        output.put("ai", element.substring(0,3) );
        output.put("reference", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse251eol (String element){
        return (parse251(element));
    }
    public Object parse253 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GDTI");
        output.put("ai", element.substring(0,3) );
        output.put("identifier", Integer.parseInt(element.substring(3, 15) ) );
        output.put("check", Integer.parseInt(element.substring(15, 16) ) );
        output.put("component", Integer.parseInt(element.substring(16)) );
        output.put("element", element);
        
        return output;
    }
    public Object parse253eol (String element){
        return (parse253(element));
    }
    public Object parse254 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GLN");
        output.put("ai", element.substring(0,3) );
        output.put("component", Integer.parseInt(element.substring(3)));
        output.put("element", element);
        
        return output;
    }
    public Object parse254eol (String element){
        return (parse254(element));
    }
    public Object parse255 (String element){
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GCN");
        output.put("ai", element.substring(0,3) );
        output.put("number", Integer.parseInt(element.substring(3, 15) ) );
        output.put("check", Integer.parseInt(element.substring(16, 17) ) );
        output.put("sc", Integer.parseInt(element.substring(17)));
        output.put("element", element);
        
        return output;
    }
    public Object parse255eol (String element){
        return(parse255(element));
    }
    
}