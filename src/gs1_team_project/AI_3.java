package gs1_team_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;

public class AI_3 extends AI {
    
    public AI_3() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "30", Pattern.compile("^30\\d{1,8}[%\\x1D]") );          // AI #17        
        super.matchers.put( "30eol", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "310", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "311", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "312", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "313", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "314", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "315", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "316", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "320", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "321", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "322", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "323", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "324", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "325", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "326", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "327", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "328", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        super.matchers.put( "329", Pattern.compile("^17[0-9]{6}") );          // AI #17        
        super.matchers.put( "330", Pattern.compile("^10(.){1,20}[%\\x1D]") ); // AI #10
        super.matchers.put( "331", Pattern.compile("^10(.){1,20}$") );     // AI #10 (eol)
        Pattern p30 = Pattern.compile("^30\\d{1,8}[%\\x1D]");
        Pattern p30eol = Pattern.compile("^30\\d{1,8}$");
        Pattern p310n = Pattern.compile("^310[0-9]{7}");
        Pattern p311n = Pattern.compile("^311[0-9]{7}");
        Pattern p312n = Pattern.compile("^312[0-9]{7}");
        Pattern p313n = Pattern.compile("^313[0-9]{7}");
        Pattern p314n = Pattern.compile("^314[0-9]{7}");
        Pattern p315n = Pattern.compile("^315[0-9]{7}");
        Pattern p316n = Pattern.compile("^316[0-9]{7}");
        Pattern p320n = Pattern.compile("^320[0-9]{7}");
        Pattern p321n = Pattern.compile("^321[0-9]{7}");
        Pattern p322n = Pattern.compile("^322[0-9]{7}");
        Pattern p323n = Pattern.compile("^323[0-9]{7}");
        Pattern p324n = Pattern.compile("^324[0-9]{7}");
        Pattern p325n = Pattern.compile("^325[0-9]{7}");
        Pattern p326n = Pattern.compile("^326[0-9]{7}");
        Pattern p327n = Pattern.compile("^327[0-9]{7}");
        Pattern p328n = Pattern.compile("^328[0-9]{7}");
        Pattern p329n = Pattern.compile("^329[0-9]{7}");
        Pattern p330n = Pattern.compile("^330[0-9]{7}");
        Pattern p331n = Pattern.compile("^331[0-9]{7}");
        Pattern p332n = Pattern.compile("^332[0-9]{7}");
        Pattern p333n = Pattern.compile("^333[0-9]{7}");
        Pattern p334n = Pattern.compile("^334[0-9]{7}");
        Pattern p335n = Pattern.compile("^335[0-9]{7}");
        Pattern p336n = Pattern.compile("^336[0-9]{7}");
        Pattern p337n = Pattern.compile("^337[0-9]{7}");
        Pattern p340n = Pattern.compile("^340[0-9]{7}");
        Pattern p341n = Pattern.compile("^341[0-9]{7}");
        Pattern p342n = Pattern.compile("^342[0-9]{7}");
        Pattern p343n = Pattern.compile("^343[0-9]{7}");
        Pattern p344n = Pattern.compile("^344[0-9]{7}");
        Pattern p345n = Pattern.compile("^345[0-9]{7}");
        Pattern p346n = Pattern.compile("^346[0-9]{7}");
        Pattern p347n = Pattern.compile("^347[0-9]{7}");
        Pattern p348n = Pattern.compile("^348[0-9]{7}");
        Pattern p349n = Pattern.compile("^349[0-9]{7}");
        Pattern p350n = Pattern.compile("^350[0-9]{7}");
        Pattern p351n = Pattern.compile("^351[0-9]{7}");
        Pattern p352n = Pattern.compile("^352[0-9]{7}");
        Pattern p353n = Pattern.compile("^353[0-9]{7}");
        Pattern p354n = Pattern.compile("^354[0-9]{7}");
        Pattern p355n = Pattern.compile("^355[0-9]{7}");
        Pattern p356n = Pattern.compile("^356[0-9]{7}");
        Pattern p357n = Pattern.compile("^357[0-9]{7}");
        Pattern p360n = Pattern.compile("^360[0-9]{7}");
        Pattern p361n = Pattern.compile("^361[0-9]{7}");
        Pattern p362n = Pattern.compile("^362[0-9]{7}");
        Pattern p363n = Pattern.compile("^363[0-9]{7}");
        Pattern p364n = Pattern.compile("^364[0-9]{7}");
        Pattern p365n = Pattern.compile("^365[0-9]{7}");
        Pattern p366n = Pattern.compile("^366[0-9]{7}");
        Pattern p367n = Pattern.compile("^367[0-9]{7}");
        Pattern p368n = Pattern.compile("^368[0-9]{7}");
        Pattern p369n = Pattern.compile("^369[0-9]{7}");
        Pattern p37 = Pattern.compile("^37\\d{1,8}[%\\x1D]");
        Pattern p37eol = Pattern.compile("^37\\d{1,8}$");
        Pattern p390n = Pattern.compile("^390\\d{2,16}[%\\x1D]");
        Pattern p390neol = Pattern.compile("^390\\d{2,16}$");
        Pattern p391n = Pattern.compile("391\\d{4,18}[%\\x1D]");
        Pattern p391neol = Pattern.compile("^391\\d{4,18}$");
        Pattern p392n = Pattern.compile("^392\\d{2,16}[%\\x1D]");
        Pattern p392neol = Pattern.compile("^392\\d{2,16}$");
        Pattern p393n = Pattern.compile("393\\d{4,18}[%\\x1D]");
        Pattern p393neol = Pattern.compile("^393\\d{4,18}$");
        Pattern p394n = Pattern.compile("^394[0-9]{5}");
        
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