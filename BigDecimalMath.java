/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.math.BigDecimal;
import java.math.*;
/**
 *
 * @author Alex Shustov
 */
public class BigDecimalMath {
    private static BigDecimal nj,tk,fp;
    private static BigDecimal sum;
    private static BigDecimal num;
    private static BigDecimal mult;
    private static BigDecimal div;
    public static void main(String[]args){
         nj = BigDecimal.valueOf(500000);
         tk = BigDecimal.valueOf(55443);
         fp = BigDecimal.valueOf(100);
         sum = nj.add(tk);//сложение двух объектов
         num = nj.subtract(tk);//вычитание двух объектов
         mult = nj.multiply(tk);//умножение первого объекта на второе
         div = nj.divide(fp);//Используется для расчета разделения двух Объектов
         System.out.println(sum);
         System.out.println(num);
         System.out.println(mult);
         System.out.println(div);
    }
}
