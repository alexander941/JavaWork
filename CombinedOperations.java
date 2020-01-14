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
public class CombinedOperations {
    static int xs = 1;
    static int a = 35;
    static int b =5;   
    public static void main(String[]args){
      while(a>b){
      a-=xs;     
      System.out.println(a);
      }     
    }
}
