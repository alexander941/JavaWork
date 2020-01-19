/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Alex Shustov
 */
public class JavaProg {
    static String Fullname="Kate";
    static int age =15;
    static String gn = "Java";
    static boolean joop;
    public static void main(String[] args) {
        String str = new String("AFF");
        String str2 = new String("AFF");
        String pin = new String("vk.ru");
        joop = pin.endsWith("vk.r");
        System.out.println("Значение"+" "+joop);
        joop = pin.endsWith("vk.ru");
        System.out.println("Значение"+" "+joop);
        
        System.out.println(age+" "+Fullname);
        System.out.println(gn.substring(0));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(gn));
        System.out.println(str.endsWith(str2));
    }
    
}
