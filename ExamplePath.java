/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.nio.file.*;
/**
 *
 * @author Alex Shustov
 */
public class ExamplePath {
    public static void main(String[]args) throws InvalidPathException {
        //Создание объекта для запуска
        Path tekstfile = Paths.get("C:\\Users\\Alex\\Desktop\\Отправленно GitHub\\JavanWork\\JavaProg\\Pathfile.txt");
        //Вывод информации о файле
        System.out.println("Путь файла"+" "+tekstfile.toString());
        System.out.println("Имя файла"+" "+tekstfile.getFileName());
        System.out.println("Система"+" "+tekstfile.getFileSystem());//Возвращение файловой системы       
    }
}
