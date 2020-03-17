/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Alex Shustov
 */
public class Task1 {
    static String log= "Введите число";
    public static void main(String[]args) throws IOException{
        System.out.println(log);
        Scanner vod = new Scanner(System.in);
        int figures  = vod.nextInt();
        File file   = new File("texti.txt");
        //Создаём файл
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        //Записать содержимое в фаил
        writer.write(Integer.toString(figures,10));
        writer.flush();//Выполнить запись
        writer.close();//Закрытие файла
        
        
    }
}
