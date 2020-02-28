/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alex
 */
public class ExampleTryandCatch {
    public static void main(String[]args){
              try {
          FileWriter fileWriter = new FileWriter("text.txt");
          fileWriter.close();
          fileWriter.write("Hello World");
      }catch (IOException e){
          System.out.println("Ошибка-Нельзя записать в закрытый файл");
      } 
    }
}
