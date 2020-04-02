/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.math.BigInteger;
import java.math.*;
/**
 *
 * @author Alex Shustov
 */
public class BigIntegerMath {
    private static BigInteger mult;
    private static BigInteger div;
    private static BigInteger rezult;
    private static BigInteger mathematicalroot;
    private static BigInteger bill,nit; 
    public static void main(String[]args){
        BigInteger fin1,fin2,fin3,fin4;
        fin1 = new BigInteger("555");
        fin2 = new BigInteger("444");
        fin4 = new BigInteger("784");
        fin3 = fin1.subtract(fin2);//вычитание двух объектов
        System.out.println("Результат"+" "+fin3);
        mult = fin1.multiply(fin2);//умножение первого объекта на второе
        System.out.println(mult);
        div = fin1.divide(fin2);//Используется для расчета разделения двух Объектов
        System.out.println(div);
        rezult = fin1.mod(fin2);//Возвращает остаток от целочисленного деления двух чисел
        System.out.println(rezult);
        //mathematicalroot = fin4.sqrt();//Возвращает квадратный корень
        System.out.println(fin1.compareTo(fin2));//Сравнения чисел 
        bill = BigInteger.valueOf(500567657);
        nit = BigInteger.valueOf(505675675);
        System.out.println("Результат первого"+" "+bill);
        System.out.println("Результат второго"+" "+nit);
    }
}
