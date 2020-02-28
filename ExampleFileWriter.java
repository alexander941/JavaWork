/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.io.*;
/**
 *
 * @author Alex Shustov
 */
public class ExampleFileWriter {
    public static void main(String []args) throws IOException{
        FileWriter Wr = new FileWriter("texti.txt");//Создаём объет с блокнотом
        Wr.write("I love programs");//Записываем в блокнот
        Wr.close();//Закрываем поток
     
    }
}
