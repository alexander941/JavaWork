/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Alex Shustov
 */
public class AsymmetricArrays {
    public static void main(String[]args){
        int[][]joke = new int[3][];//Создание двухмерного массива с 3 строками
        
        //Опеределяем для массива колличество элементов для  строки
        joke[0]=new int[2];
        joke[1]=new int[4];
        joke[2]=new int[6];
        
        //Цикл для вывода массива на экран
        for(int a=0;a<joke.length;a++){
            for(int b=0;b<joke[a].length;b++){
                System.out.println(joke[a][b]+" ");
            }
        }
       //При создании массива его элементы автоматически инициализируются нулями 
    }
}
