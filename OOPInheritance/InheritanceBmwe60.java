/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 * Наследование
 * @author Alex
 */
public class InheritanceBmwe60 extends InheritanceCar {
    //Переопределение метода для класса
    @Override
    public void brake(){
        super.brake();//Для обращения к родительскому классу
        System.out.println("Тормозной путь 300 метров");
    }
    @Override
    public void accelerator(){
        super.accelerator();
        System.out.println("BMW in С 0 до 100 за 6 секунд");
    }
    
    public static void main(String[]args){
        InheritanceBmwe60 Car = new InheritanceBmwe60();//Создание объекта
        Car.brake();
        Car.accelerator();
       
    }
}
