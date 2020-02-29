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
public class ExampleScanner {
    static String bin = "Car volvo \n 100+150=250"; 
    static String jil ="Car Bmw 150+130=280";
    public static void main(String[]args){
        Scanner Hi = new Scanner(bin);
        Scanner Gi = new Scanner(jil);
        Scanner Fi = new Scanner(System.in);
        Scanner Ki = new Scanner(System.in);
        System.out.println("Result"+" "+Hi.nextLine());
        System.out.println("Шт"+Hi.nextLine());
        System.out.println(Gi.next("Car"));
        System.out.println(Gi.next("Bmw"));
        int number = Fi.nextInt();
        double numbe = Ki.nextDouble();
        System.out.println("Вывод числа целого"+" "+ number);
        System.out.println("Вывод числа дробного"+" "+ numbe);
        System.out.println("Результат"+Hi.hasNext("Car"));
        System.out.println("Результат"+Hi.hasNext("Bmw"));
        Hi.close();
    }
}
