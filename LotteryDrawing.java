/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.*;
import java.lang.Math.*;

/**
 *
 * @author Alex
 */
public class LotteryDrawing {
  
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);//Создаём консоль для ввода чисел
        
        System.out.println("Сколько чисел вам нужно написать");
        int f = scan.nextInt();//Создаётся переменная вкоторую записываются числа введенные пользователем
        
        System.out.println("Какое наибольшее число вы можете написать?");
        int g = scan.nextInt();//Записывается наиболшее число
        
        //Заполняем массив числами
        int[] number = new int[g];
        
        for(int a =0;a<number.length;a++){
            number[a]=a+1;
    }
        
        //Выбираем f номеров и помещаем во второй массив
        int [] result = new int [f];
        
        for(int a=0;a<result.length;a++){
            // получить случайный индекс в пределах от 0 до п - 1
            int ty = (int) (Math.random()*g);
            
            // выбрать элемент из произвольного места
            result[a] = number [ty];
            
            // переместить последний элемент в произвольное место
            number [ty] = number [g - 1];
            g --;
            
            //Вывод отсортированного массива
            Arrays.sort(result);
            System.out.println("Поставить следующую комбинацию");
            for(int m : result){
                System.out.println(ty);
            }
        }
    }
}
