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
public class ClassArray {
    public static void main(String[]args){
        int[]f = new int[10];
        String[]gl = new String[5];
        int[] hx = new int[5];
        int [] smallmassiv ={32,56,64,89};
        int [] truenumbers = smallmassiv;//Скопировали данные массива в другой
        truenumbers [2]=22;//Два массива ссылаються на ячейку в которой есть число 22
        
        //Массив f
        f[0]=1;
        f[1]=200;
        f[2]=500;
        f[3]=45;
        f[9]=77;

        //Массив gl
        gl[0]="Honda";
        gl[1]="Bmw";
        gl[2]="Mercedes";
        gl[3]="Porshe";
        gl[4]="Audi";
   
        //Массив hx
        hx[0]=10;
        hx[1]=35;
        hx[2]=75;
        hx[3]=45;
        hx[4]=15;
        
        for(int g:hx){//Перебрать массив
            System.out.print(" "+g);//Вывести резульат перебора
        }
        
        Arrays.sort(smallmassiv);//Переборка массива по возрастанию
        System.out.println(f.length);//Проверка сколько ячеек в массиве
        System.out.println(Arrays.toString(f));//Какие значения в ячейках
        int[] copiedMassiv = Arrays.copyOf(truenumbers, truenumbers.length);//
        System.out.println("Колличество"+" "+gl.length);
        System.out.println(Arrays.toString(gl));
        System.out.println(Arrays.toString(truenumbers));
        System.out.println(Arrays.toString(smallmassiv));
    }
}
