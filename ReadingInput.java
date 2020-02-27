/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.*;
/**
 *
 * @author Alex Shustov
 */
public class ReadingInput {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("What brand of car?");
        String brand = in.nextLine();
        System.out.println("Названия автомобиля");
        String carname = in.next();
        System.out.println("age car release");
        int age = in.nextInt();
        System.out.println("Бренд"+" "+brand+" "+"Названия автомобиля"+" "+carname+" "+"Возраст автомобиля"+" "+age);
    }
}
