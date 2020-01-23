/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Alex
 */
public class StringClassAPIApplication {
    static String index = "honda";
    static Integer x = 50;
    static boolean will;
    public static void main(String[]args){
        String woll = new String("Milk");
        String guns = new String("TT");
        String guns1 = guns;
        String strim1 ="Mersedes S-class";
        String strim2 = strim1; 
        String strim3 = new String("HELLOY");
        String strim4 = new String("MERSEDES S-CLASS"); 
        
        char fj = index.charAt(0);//Возвращает символ, расположенный на указанной позиции
        int first = index.codePointAt(0);//Возвращает кодовую точку, начало 
        int last = index.codePointAt(4);//или конец которой находится на указанной позиции
        int rest = index.offsetByCodePoints(1, 4);//Возвращает индекс кодовой точки, которая отстоит на количество,кодовых точек от исходной кодовой точки на позиции
        will = woll.endsWith("Milk");
        System.out.println(will +" "+"Правильный аргумент");
        will = woll.endsWith("Mil");
        System.out.println(will+" "+"Не правильный аргумент");
        will = strim1.equalsIgnoreCase(strim2);
        System.out.println("Rezult"+" "+will);
        will = strim1.equalsIgnoreCase(strim3);
        System.out.println("Rezult"+" "+will);
        will = strim1.equalsIgnoreCase(strim4);
        
        System.out.println("Rezult"+" "+will);
        System.out.println(guns.equals(guns1));
        System.out.println(fj);
        System.out.println(first);
        System.out.println(last);
        System.out.println(rest);
        System.out.println(x.compareTo(100));
        System.out.println("Найден индекс" +" "+ strim1.indexOf('M'));
        System.out.println("Найден индекс" +" "+ strim4.indexOf('S',5 ));
        
    }
}
