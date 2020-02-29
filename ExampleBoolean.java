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
public class ExampleBoolean {
    static String jk = "Car Sport";
    public static void main (String[]args){
        Scanner can = new Scanner(jk);
        System.out.println(can.hasNext("Car"));
        System.out.println(can.hasNext("Sport"));
    }
}
