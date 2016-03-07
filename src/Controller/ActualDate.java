/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Calendar;

/**
 *
 * @author nonek
 */
public class ActualDate {
    
    static Calendar calendar =  Calendar.getInstance();
    static int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
    static int monthOfYear =calendar.get(Calendar.MONTH);
    static int year = calendar.get(Calendar.YEAR);
    static int hour = calendar.get(Calendar.HOUR_OF_DAY);
    static int min = calendar.get(Calendar.MINUTE);
    static int sec = calendar.get(Calendar.SECOND);
    
    public static String getDateActual(){
        return dayOfMonth+"/"+monthOfYear+"/"+year+" -- "+hour+":"+min+":"+sec;
    }
    
    public static String getSimpleDate(){
        return dayOfMonth+"/"+monthOfYear+"/"+year;
    }
    
}
