/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author Alex Shsutov
 */
public class EnumeratedTypes {

    /**
     *
     */
   static public enum Dimensions {
        XS,
        S,
        M,
        L,
        XL,
        XXL;        
    }

    public static void main(String[]args){
       System.out.println("Jeans"+ Dimensions.XL);
       System.out.println("TShort"+Dimensions.L);
    }
}
