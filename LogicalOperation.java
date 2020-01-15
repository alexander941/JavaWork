/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

/**
 *
 * @author Alex
 */
public class LogicalOperation {
    static boolean g = true;
    static boolean a = true;
    static boolean f = false;
    static int m =90;
    static boolean h;
    public static void main(String[]args){
        if(a&&g){
            System.out.println("Значение верно");
        }
        if(g&&f){
            System.out.println("А Правильно ли");
        }
        if(!f&&a&&g){
            System.out.println("Логический Оператор Отрицания");
        }
        if(f|g){
            System.out.println("Логический Оператор ИЛИ");
        }
        if(a^f){
            System.out.println("Логический оператор Исключения");
        }
        //Тернальный операция
        if(h=m==90?true:false){
            System.out.println("Логический Тернальный оператор");
        } 
    }
}
