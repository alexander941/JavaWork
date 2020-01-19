/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Alex
 */
public class EmptyandZeroStrings {
    static String gon = "";
    static String bon = null;
    public static void main(String[]args){
        System.out.println(gon.equals(bon));
        System.out.println(gon==bon);
    }
}
