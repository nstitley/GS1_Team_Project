package gs1_team_project;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AI {

    /* GS1 Matcher/Parser Collection Superclass */
    
    HashMap<String, Pattern> matchers;
    
    public Object parse(String code) {
        Object output = null;
        boolean aa = false; //00
        boolean ab = false; //01
        boolean ac = false; //01w0
        boolean ad = false; //01w9
        boolean ae = false; //02
        boolean af = false; //02w9
        boolean ag = false; //10
        boolean ah = false; //11
        boolean ai = false; //12
        boolean aj = false; //13
        boolean ak = false; //15
        boolean al = false; //16
        boolean am = false; //17
        boolean an = false; //20    
        boolean ao = false; //21    
        boolean ap = false; //22    
        boolean aq = false; //240    
        boolean ar = false; //241   
        boolean as = false; //242   
        boolean at = false; //243      
        boolean au = false; //250   
        boolean av = false; //251
        boolean aw = false; //254   
        boolean ax = false; //255   
        boolean ay = false; //3nnn*   
        boolean az = false; //3nnn** 
        boolean ba = false; //30
        boolean bb = false; //37    
        boolean bc = false; //337n    
        boolean bd = false; //390n  
        boolean be = false; //391n  
        boolean bf = false; //392n  
        boolean bg = false; //393n
        boolean bh = false; //394n  
        boolean bi = false; //414  
        boolean bj = false; //415   
        boolean bk = false; //420   
        boolean bl = false; //421   
        boolean bm = false; //422   
        boolean bn = false; //423   
        boolean bo = false; //424   
        boolean bp = false; //425   
        boolean bq = false; //426   
        boolean br = false; //427
        boolean bs = false; //703(s)   
        boolean bt = false; //723s
        boolean bu = false; //710  
        boolean bv = false; //711   
        boolean bw = false; //712   
        boolean bx = false; //713  
        boolean by = false; //714   
        boolean bz = false; //7001   
        boolean ca = false; //7002  
        boolean cb = false; //7003  
        boolean cc = false; //7004
        boolean cd = false; //7005  
        boolean ce = false; //7006 
        boolean cf = false; //7007  
        boolean cg = false; //7008  
        boolean ch = false; //7009  
        boolean ci = false; //7010  
        boolean cj = false; //7020  
        boolean ck = false; //7021  
        boolean cl = false; //7022  
        boolean cm = false; //8001  
        boolean cn = false; //8005
        boolean co = false; //8006***  
        boolean cp = false; //8006w9***
        boolean cq = false; //8007
        boolean cr = false; //8008  
        boolean cs = false; //8009  
        boolean ct = false; //8011  
        boolean cu = false; //8012  
        boolean cv = false; //8017  
        boolean cw = false; //8018  
        boolean cx = false; //8019  
        boolean cy = false; //8020
        boolean cz = false; //8026
        boolean da = false; //8026w9
        boolean db = false; //8111
        boolean dc = false; //8200
        boolean dd = false; //ab part two
        boolean de = false; //bg part two
        boolean df = false; //403
        boolean dg = false; //416
        boolean dh = false; //8004
        boolean di = false; //8010
        
        //Booleans for mandatory codes
        
        
            if ((ab && dd) != false){
                System.out.println("Shutdown");
            }
            if ((ab && ae) != false){
                System.out.println("Shutdown");
            }
            if ((ab && bb) != false){
                System.out.println("Shutdown");
            }
            if ((ab && ax) != false){
                System.out.println("Shutdown");
            }
            if ((bk && bl) != false){
                System.out.println("Shutdown");
            }
            if ((bm && bq) != false){
                System.out.println("Shutdown");
            }
            if ((bn && bq) != false){
                System.out.println("Shutdown");
            }
            if ((bo && bq) != false){
                System.out.println("Shutdown");
            }
            if ((bp && bq) != false){
                System.out.println("Shutdown");
            }
            if ((bd && be) != false){
                System.out.println("Shutdown");
            }
            if ((bd && bh) != false){
                System.out.println("Shutdown");
            }
            if ((bd && db) != false){
                System.out.println("Shutdown");
            }
            if ((bg && de) != false){
                System.out.println("Shutdown");
            }
            if ((bh && db) != false){
                System.out.println("Shutdown");
            }
            if ((co && ab) != false){
                System.out.println("Shutdown");
            }
            if ((co && bb) != false){
                System.out.println("Shutdown");
            }
            if ((cw && cv) != false){
                System.out.println("Shutdown");
            }
            if ((cz && ae) != false){
                System.out.println("Shutdown");
            }           
            if ((cz && co) != false){
                System.out.println("Shutdown");
            }
            
            if (ac || ba || ay == true){
                if ((ac && (ba || ay)) == true){
                    System.out.println("ac && (ba || ay");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ad || ba || ay || cm == true){
                if ((ad && (ba || ay || cm)) == true){
                    System.out.println("ad && (ba || ay || cm)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( af || ba || ay || cm == true){
                if ((af && (ba || ay || cm)) == true){
                    System.out.println("af && (ba || ay || cm)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ad || as == true){
                if ((ad && as) == true){
                    System.out.println("ad && as");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ae || aa || bb == true){
                if ((ae && (aa && bb)) == true){
                    System.out.println("ae && (aa && bb)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ag || ab || ae || co || cz == true){
                if ((ag && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("ag && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ah || ab || ae || co || cz == true){
                if ((ah && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("ah && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( aj || ab || ae || co || cz == true){
                if ((aj && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("aj && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ak || ab || ae || co || cz == true){
                if ((ak && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("ak && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( al || ab || ae || co || cz == true){
                if ((al && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("al && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( am || ab || ae || co || cz == true){
                if ((am && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("am && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ai || cy || bj == true){
                if ((ai && (cy && bj)) == true){
                    System.out.println("ai && (cy && bj)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( am || ax == true){
                if ((am && ax) == true){
                    System.out.println("am && ax");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( an || ab || ae || co || cz == true){
                if ((an && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("an && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ao || ab || co == true){
                if ((ao && (ab ^ co)) == true){
                    System.out.println("ao && (ab ^ co)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ap || ab == true){
                if ((ap && ab) == true){
                    System.out.println("ap && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( aq || ab || ab || co || cz == true){
                if ((aq && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("aq && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ar || ab || ae || co || cz == true){
                if ((ar && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("ar && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( as || ad || af || cp || da == true){
                if ((as && (ad ^ af ^ cp ^ da)) == true){
                    System.out.println("as && (ad ^ af ^ cp ^ da)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( at || ab == true){
                if ((at && ab) == true){
                    System.out.println("at && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( au || ab || co || ao == true){
                if ((au && (ab ^ co) && ao) == true){
                    System.out.println("au && (ab ^ co) && ao");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( av || ab || co == true){
                if ((av && (ab ^ co)) == true){
                    System.out.println("av && (ab ^ co)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( aw || bi == true){
                if ((aw && bi) == true){
                    System.out.println("aw && bi");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ba || ab || ae == true){
                if ((ba && (ab ^ ae)) == true){
                    System.out.println("ba && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ay || ab || ae == true){
                if ((ay && (ab ^ ae)) == true){
                    System.out.println("ay && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( az || aa || ab == true){
                if ((az && (aa ^ ab)) == true){
                    System.out.println("az && (aa ^ ab)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bc || ab == true){
                if ((bc && ab) == true){
                    System.out.println("bc && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bb || aa || ae || cz == true){
                if ((bb && aa && (ae ^ cz)) == true){
                    System.out.println("bb && aa && (ae ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bd || cy || bj == true){
                if ((bd && cy && bj) == true){
                    System.out.println("bd && cy && bj");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bd || ax == true){
                if ((bd && ax) == true){
                    System.out.println("bd && ax");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( be || cy || bj == true){
                if ((be && cy && bj) == true){
                    System.out.println("be && cy && bj");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bf || ab || ba || ay == true){
                if ((bf && ab && (ba ^ ay)) == true){
                    System.out.println("(bf && ab && (ba ^ ay)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bg || ab || ba || ay == true){
                if ((bg && ab && (ba ^ ay)) == true){
                    System.out.println("bg && ab && (ba ^ ay)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bh || ax == true){
                if ((bh && ax) == true){
                    System.out.println("bh && ax");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( df || aa == true){
                if ((df && aa) == true){
                    System.out.println("df && aa");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bj || cy == true){
                if ((bj && cy) == true){
                    System.out.println("bj && cy");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bm || ab || ae || co || cz == true){
                if ((bm && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("bm && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bn || ab || ae == true){
                if ((bn && (ab ^ ae)) == true){
                    System.out.println("bn && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bo || ab || ae == true){
                if ((bo && (ab ^ ae)) == true){
                    System.out.println("bo && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bp || ab || ae == true){
                if ((bp && (ab ^ ae)) == true){
                    System.out.println("bp && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bq || ab || ae == true){
                if ((bq && (ab ^ ae)) == true){
                    System.out.println("bq && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( br || ab || ae || bm == true){
                if ((br && (ab ^ ae) && bm) == true){
                    System.out.println("br && (ab ^ ae) && bm");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bz || ab || ae || co || cz == true){
                if ((bz && (ab ^ ae ^ co ^ cz)) == true){
                    System.out.println("bz && (ab ^ ae ^ co ^ cz)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ca || ab || ae == true){
                if ((ca && (ab ^ ae)) == true){
                    System.out.println("ca && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cb || ab || ae == true){
                if ((cb && (ab ^ ae)) == true){
                    System.out.println("cb && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cc || ab || ag == true){
                if ((cc && (ab ^ ag)) == true){
                    System.out.println("cc && (ab ^ ag)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cd || ab || ae == true){
                if ((cd && (ab ^ ae)) == true){
                    System.out.println("cd && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ce || ab || ae == true){
                if ((ce && (ab ^ ae)) == true){
                    System.out.println("ce && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cf || ab || ae == true){
                if ((cf && (ab ^ ae)) == true){
                    System.out.println("cf && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cg || ab || ae == true){
                if ((cg && (ab ^ ae)) == true){
                    System.out.println("cg && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ch || ab || ae == true){
                if ((ch && (ab ^ ae)) == true){
                    System.out.println("ch && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ci || ab || ae == true){
                if ((ci && (ab ^ ae)) == true){
                    System.out.println("ci && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bs || ab || ae == true){
                if ((bs && (ab ^ ae)) == true){
                    System.out.println("bs && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bu || ab == true){
                if ((bu && ab) == true){
                    System.out.println("bu && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bv || ab == true){
                if ((bv && ab) == true){
                    System.out.println("bv && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bw || ab == true){
                if ((bw && ab) == true){
                    System.out.println("bw && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bx || ab == true){
                if ((bx && ab) == true){
                    System.out.println("bx && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( by || ab == true){
                if ((by && ab) == true){
                    System.out.println("by && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cj || ab || co || dg == true){
                if ((cj && (ab ^ co) && dg) == true){
                    System.out.println("cj && (ab ^ co) && dg");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ck || ab || co == true){
                if ((ck && (ab ^ co)) == true){
                    System.out.println("ck && (ab ^ co)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cl || ab || co || ck == true){
                if ((cl && (ab ^ co) && ck) == true){
                    System.out.println("cl && (ab ^ co) && ck");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( bt || ab || dh == true){
                if ((bt && (ab ^ dh)) == true){
                    System.out.println("bt && (ab ^ dh)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cm || ab == true){
                if ((cm && ab) == true){
                    System.out.println("cm && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cn || ab || ae == true){
                if ((cn && (ab ^ ae)) == true){
                    System.out.println("cn && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cq || cy || bj == true){
                if ((cq && cy && bj) == true){
                    System.out.println("cq && cy && bj");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cr || ab || ae == true){
                if ((cr && (ab ^ ae)) == true){
                    System.out.println("cr && (ab ^ ae)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cs || ab || aa == true){
                if ((cs && (ab ^ aa)) == true){
                    System.out.println("cs && (ab ^ aa)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( ct || di == true){
                if ((ct && di) == true){
                    System.out.println("ct && di");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cu || ab || co == true){
                if ((cu && (ab ^ co)) == true){
                    System.out.println("cu && (ab ^ co)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cx || cv || cw == true){
                if ((cx && (cv ^ cw)) == true){
                    System.out.println("cx && (cv ^ cw)");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cy || bj == true){
                if ((cy && bj) == true){
                    System.out.println("cy && bj");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( cz || aa || bb == true){
                if ((cz && aa && bb) == true){
                    System.out.println("cz && aa && bb");
                }
                else {
                    System.out.println("Shutdown");
                }
                
            }
            if ( db || ax == true){
                if ((db && ax) == true){
                    System.out.println("db && ax");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            if ( dc || ab == true){
                if ((dc && ab) == true){
                    System.out.println("dc && ab");
                }
                else {
                    System.out.println("Shutdown");
                }
            }
            
    

        
        for (Map.Entry<String, Pattern> entry : matchers.entrySet()) {
            
            /* Identify entity string by Application Identifier */
            String key = entry.getKey();
            Matcher matcher = entry.getValue().matcher(code);

            if (matcher.find()) {
                /* If a match is found, invoke the corresponding parse method (in child class) */
                
                try {
                    Method method = this.getClass().getDeclaredMethod(("parse" + key), String.class);
                    output = method.invoke( this, matcher.group() );
                }
                catch (Exception e) {
                    System.err.println("Parser Method Exception: " + e.toString() );
                }
                
                /* If a match was found, break main loop (since there is no need to try the remaining matchers) */
                
                break;
                
            }

        }
        
        /* Return parsed results as an associative collection */
        
        return output;
        
    }    
}
