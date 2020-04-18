/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *  Инкапсуляция
 * @author Alex 
 */
public class Encapsulationexample1 {
    public static void main(String[]args){
        //Cоздание объекта из класса Инкапсуляции
        UserRegistration UsRegist = new UserRegistration();
        
        //Вызываем переменные 
        UsRegist.setName("Сергей");
        UsRegist.setSurname("Шимелин");
        UsRegist.setAge(18);//Вызов метод класса, чтобы установить возраст
        UsRegist.setphone("89957787889898");
        
        System.out.println("Имя"+" "+UsRegist.getName()+" "+"Фамилия"+" "+UsRegist.getSurname());
        System.out.println("Возраст"+" "+UsRegist.getAge());
        System.out.println("Телефон"+" "+UsRegist.getphone());
        
        
    }
}
