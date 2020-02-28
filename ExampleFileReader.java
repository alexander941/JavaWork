/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class ExampleFileReader {
   public static void main(String[]args)throws Exception {
       FileReader FR = new FileReader("texti.txt");
       Scanner scan = new Scanner(FR);
       FR.close();
   } 
}
