/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.io.*;
import java.lang.StringBuffer;
/**
 *
 * @author Alex Shustov
 */
public class Buildingcharacterstrings {
    static char ch1 = '$';
    static int him = 20;
    static String str;
    static String car ="Honda";
    static int ca = car.length();//Считаем сколько символов занимает переменная car
    static String car1 ="subaru"; 
    static int ca1 = car1.length();
    
    public static void main(String[]args){
        String gik = new String("Сайт на vk.com");
        StringBuffer Buffer = new StringBuffer("Тест");
        StringBuilder builder = new StringBuilder();
        StringBuilder str = new StringBuilder("www.awm-");
        StringBuilder stim = new StringBuilder("Lamborgini very fast");
        builder.append(ch1);//Добавление символа
        builder.append(him);//Добавление числового значения
        builder.append(str);//Добавление строк
        Buffer.appendCodePoint(65);
        Buffer.setCharAt(0, 'G');//
        str.insert(7,"leader.ru");
        str.insert(0,'H');
        stim.delete(10, 15);//Удаление строчной фразы
        
        
        
        System.out.println(gik.toString());
        System.out.println("Переменная car занимает"+" "+ca+" "+"Символов");
        System.out.println("Переменная car1 занимает"+" "+ca1+" "+"Символов");
        System.out.println(Buffer);
        System.out.println(str.toString());//Выводит значение символьной строки
        System.out.println(stim.toString());
    } 
}
