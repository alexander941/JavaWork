/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Alex Shusov
 */
public class MultidimensionalArrays {
    
    public static void main(String[]args){
        
        int [][] firsttable= new int[2][3];//создание двухмерного массива
        
        firsttable[0][0]=1;
        firsttable[0][1]=5;
        firsttable[0][2]=7;
        firsttable[1][0]=2;
        firsttable[1][1]=4;
        firsttable[1][2]=6;
        
        //Используем цикл для вывода массива
        for(int x = 0;x<2;x++){
            
            for(int y=0;y<3;y++){
                System.out.println(firsttable[x][y]);
            }
            System.out.println();
        }
        
    }
}
