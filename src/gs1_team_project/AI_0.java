package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_0 extends AI {
    
    public AI_0() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "00", Pattern.compile("^00[0-9]{18}") ); // AI #00
        super.matchers.put( "01", Pattern.compile("^01[0-9]{14}") ); // AI #01
        super.matchers.put( "02", Pattern.compile("^02[0-9]{14}") ); // AI #02
        Pattern p00 = Pattern.compile("^00[0-9]{18}");
        Pattern p01 = Pattern.compile("^01[0-9]{14}");
        Pattern p02 = Pattern.compile("^02[0-9]{14}");
        
    }
    
    public Object parse01(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GTIN");
        output.put("ai", element.substring(0, 2) );
        output.put("prefix", Integer.parseInt( element.substring(2, 10) ) );
        output.put("item", Integer.parseInt( element.substring(10, 15) ) );
        output.put("check", Integer.parseInt( element.substring(15) ) );
        output.put("element", element);
        
        return output;
        
    }
}
