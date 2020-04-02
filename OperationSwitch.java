/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Alex Shustov
 */
public class OperationSwitch {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);//Создаём объект
        System.out.println("Выберите опцию");
        int option = scan.nextInt();
        switch(option){//используем для проверки введённых опций 
        case 1:
            System.out.println("Первая опция");
        break;
        case 2:
            System.out.println("Вторая опция");
        break;
        case 3:
            System.out.println("Третья опция");
        break;
        case 4:
            System.out.println("Четвёртая опция");
        break;
        default://Ошибка выводиться по умолчанию при выборе не той опции
            System.err.println("Ошибка"); 
    }
    }
}
