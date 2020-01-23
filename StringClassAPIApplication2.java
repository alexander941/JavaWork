/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.io.*;
import java.lang.*;
import java.util.Locale;
/**
 *
 * @author Alex Shustov
 */
public class StringClassAPIApplication2 {
    public static void main(String[]args){
        String st = new String("Deutsch cars"+"MERSEDES"+"BMW"+"PORSСHE"+"AUDI");
        String stig1 = new String("MERSEDES");
        String stig2 = new String("PORSСHE");
        String sq = "BMW AND AUDI";
        int reslt = sq.codePointCount(1, 11);
        String hqq = " Trend  ";
        
        System.out.println("Index"+" "+"Last"+" "+st.lastIndexOf('D'));
        System.out.println("Index"+" "+"Last"+" "+stig1.lastIndexOf('E', 3));
        System.out.println("Index"+" "+"Last"+" "+st.lastIndexOf(stig2));
        System.out.println("Длинна строки"+" "+st.length());
        System.out.println("Количество кодов ="+" "+reslt);
        System.out.println("Получаем"+" "+stig2.replace('P', 'p'));
        System.out.print("Начало результата"+" ");
        System.out.println(st.startsWith("Deutsch cars"));
        System.out.print("Конечный результата"+" ");
        System.out.println(sq.startsWith("AUDI",40));
        System.out.println(st.substring(12,15));
        System.out.println(st.substring(5));
        System.out.println(st.toLowerCase(Locale.GERMANY));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.toUpperCase(Locale.ENGLISH));
        System.out.println(hqq.trim());
        
    }
}
