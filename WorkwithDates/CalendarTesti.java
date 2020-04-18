/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.*;
import java.text.DateFormatSymbols;
/**
 *
 * @author Alex
 */
public class CalendarTesti {
    public static void main(String[]args){
        //Построение объекта текущей даты 
        GregorianCalendar gorian = new GregorianCalendar();
        
        int today = gorian.get(Calendar.DAY_OF_MONTH);
        int month = gorian.get(Calendar.MONTH);
        
        //Установить объект на начало месяца
        gorian.set(Calendar.DAY_OF_MONTH,1);
        
        int weekday = gorian.get(Calendar.DAY_OF_WEEK);
        
        //получить первый день недели(воскресенье в США)
        int firstDayOfWeek = gorian.getFirstDayOfWeek();
        
        //Определить отступ требующийся в первой строке
        int indent = 0;
        while(weekday !=firstDayOfWeek){
            indent++;
            gorian.add(Calendar.DAY_OF_MONTH, -1);//добавления элементов
            weekday = gorian.get(Calendar.DAY_OF_WEEK);
        }
        
        //Вывод название дней недели
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        
        do {
            System.out.printf("%4s",weekdayNames[weekday]);
            gorian.add(Calendar.DAY_OF_MONTH,1);
            weekday = gorian.get(Calendar.DAY_OF_WEEK);
        }
        while(weekday !=firstDayOfWeek);
        
        System.out.println();
        
        for(int i =1; i <=indent;i++)
            System.out.print(" ");
        
        gorian.set(Calendar.DAY_OF_MONTH,1);
        
        do {
            //Вывести день недели
            int day = gorian.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);
            
            //Пометить текущий день знаком *
            if(day==today)System.out.print("*");
            else System.out.print(" ");
            
            //Продвижения gorian к следующему дню
            gorian.add(Calendar.DAY_OF_MONTH,1);
            weekday = gorian.get(Calendar.DAY_OF_WEEK);
            
            //начать очередную неделю с новой строки
            if(weekday == firstDayOfWeek)System.out.println();
        }
        while(gorian.get(Calendar.MONTH)==month);
        // Первый день следующего месяца 
        //перевести строку если требуется
        if(weekday !=firstDayOfWeek)System.out.println();
    }
}
