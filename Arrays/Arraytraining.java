/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.util.Arrays;

/**
 *
 * @author Alex
 */
public class Arraytraining {
    
    public static void main(String[]args){
        int[] bik = new int [10];//Создание массива bik
        int[]fig = new int[]{5,10,7,25};
        int[]guf = Arrays.copyOf(fig,fig.length);
        int[]huf= Arrays.copyOfRange(bik, bik[0], bik[3]);
        int[]nik = new int[]{1,7,5,9,18};
        int intKey = 0;
        Boolean first = new Boolean(true);
        Boolean two = new Boolean(false);
        
        Arrays.sort(fig);
        Arrays.fill(nik, 7);//Устанавливает значения массива
        

        bik[0]=25;
        bik[1]=3;
        bik[2]=7;
        bik[3]=2;
        
        if(first.equals(two)){
            System.out.println("Правильный объект");
        }else{
        System.err.println("Ошибка");
    }
                
        System.out.println(Arrays.toString(nik));
        System.out.println(Arrays.binarySearch(bik,intKey));//алгоритм бинарного поиска для нахождения значения
        System.out.println(bik.toString());//Возвращает строку с элементами массива
        
    }
}
