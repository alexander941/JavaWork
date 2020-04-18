/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.util.*;

/**
 *
 * @author Alex
 */
public class ObjectsAndObjectVariables {
    static Date deadline;//Переменная с датой
    
    public static void main(String[]args){
        Date deadline = new  Date();//Создание объекта
        GregorianCalendar caldat = new GregorianCalendar ();
        GregorianCalendar calendar = new GregorianCalendar(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH);
        
        int month = caldat.get(Calendar.MONTH);//Метод доступа(просмотр)
        int weekday = caldat.get(Calendar.DAY_OF_WEEK);//get просматривает состояние объекта и сообщает о нем
        
        caldat.set(Calendar.YEAR,2019);//Модифицирующими
        caldat.set(Calendar.MONTH,Calendar.MARCH);
        caldat.set(Calendar.DAY_OF_WEEK,10);
        
       
        System.out.println(caldat.getTime());//Вывод текущей даты со временем
        System.out.println(deadline.toString());//Вывод текущей даты со временем

    }
}
