/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.io.Console;
/**
 *
 * @author Alex Shustov
 */
public class Cantilever {
    public static void main(String[]args){
        Console console = System.console();
        String username = console.readLine();
        char[] password = console.readPassword("Введите пароль");
        console.printf("Введенный логин: %s \n", username);
        console.printf("Введенный пароль: %s \n", new String(password));
        
    }
}
