/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasetest;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;

// Contains information from the database about a single shift ruleset


public class Shift {
    
    private String description;
    private GregorianCalendar start;
    private GregorianCalendar stop;
    private int interval;
    private int grace_period;
    private int dock;
    private GregorianCalendar lunch_start;
    private GregorianCalendar lunch_stop;
    private int lunch_deduct;
    private int max_time;
    private String over_time_threshold;
    
    public Shift() {
        description = "";
        start = new GregorianCalendar();
        stop = new GregorianCalendar();
        interval = 0;
        grace_period = 0;
        dock = 0;
        lunch_start = new GregorianCalendar();
        lunch_stop = new GregorianCalendar();
        lunch_deduct = 0;
        max_time = 0;
        over_time_threshold = "";
        
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public GregorianCalendar getStart() {
        return start;
    }
    
    public void setStart(Date start) {
        this.start.setTime(start);
    }
    
    public GregorianCalendar getStop() {
        return stop;
    }
    public void setStop(Date stop) {
        this.stop.setTime(stop);
    }
    public int getInterval() {
        return interval;
    }
    
    public void setInterval(int interval) {
        this.interval = interval;
    }
    
    public void getGrace_period(int grace_period) {
        this.grace_period = grace_period;
    }
    
    public int getDock(){
        return dock;
    }
    
    public void setDock(int dock) {
        this.dock = dock;
    }
    
    public GregorianCalendar getLunch_start() {
        return lunch_start;
    }
    
    public void setLunch_start(Date lunch_start){
        this.lunch_start.setTime(lunch_start);    
    }
    
    public int getMax_time() {
        return max_time;
    }
    
    public void setMax_time(int max_time){
        this.max_time = max_time;   
    }
    
    public String getOver_time_threshold() {
        return over_time_threshold;
    }
    
    public void setOver_time_threshold(String over_time_threshold){
        this.over_time_threshold = over_time_threshold;
    }
    
    //Calculate difference between times and returns in minutes
    public long calculateDifference(String t1, String t2){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time1 = LocalTime.parse(t1, format);
        LocalTime time2 = LocalTime.parse(t2, format);
        long minutes = ChronoUnit.MINUTES.between(time1, time2);
        return minutes;
    }
    
    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date start1 = start.getTime();
        Date stop1 = stop.getTime();
        Date lunch_start1 = lunch_start.getTime();
        Date lunch_stop1 = lunch_stop.getTime();
        
        long start_stop_diff = (stop1.getTime() - start1.getTime())/(60*1000);
        long lunch_diff = (lunch_stop1.getTime() - lunch_start1.getTime())/(60*1000);
        
    return ("hey");   // return "minutes" + lunch_diff + description + ":" + sdf.format(start.getTime())+ " - " + sdf.format(stop.getTime()) + "(" + start_stop_diff + "minutes); Lunch " + sdf.format(lunch_start.getTime()) + sdf.format(lunch_stop.getTime()) + "(" 
    }
    
}
    
    
    
   