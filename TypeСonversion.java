/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author Alex Shustov
 */
public class TypeСonversion {
    public static void main(String[]args){
      byte a = 5;
      short b = a;//Преобраование
      char w = 1;
      int r =w;
      int y = 50;
      double j = y;
      double f = 2.3;
      int gf = (int)Math.round(f);//округление числа
      System.out.println(b);
      System.out.println(r);
      System.out.println(j);
      System.out.println(gf);
    }
}
