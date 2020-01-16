/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;
import static java.lang.Math.*;
/**
 *
 * @author Alex Shustov
 */
public class MathFunctions {
    static int f = 5;
    static double b = 7.5;
    public static void main(String[]args){
      double у = Math.sqrt (b);
      System.out.println(у);
      System.out.println(Math.tan(у)+f);
      System.out.println(Math.PI);
      System.out.println(Math.E);
      System.out.printf("exp(%.2f) = %.2f%n", b, Math.exp(b)); 
    }
}
