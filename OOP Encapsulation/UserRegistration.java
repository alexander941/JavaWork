/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 * Инкапсуляция
 * @author Alex Shustov
 */
public class UserRegistration {
   private String Name;
   private String Surname;
   private int Age;
   private String phone;
   
   //Исользуется для вывода переменной
   public String getName(){
      return Name; 
   }
   public String getSurname(){
       return Surname;
   }
   public int getAge(){
       return Age;
   } 
   public String getphone(){
       return phone;
   }
   
   //Используется для ввода переменной
   public void setName(String newName){//Создание Объекта
       Name=newName;
   }
   public void setSurname(String newSurname){//Создание Объекта
      Surname = newSurname; 
   }
   public void setAge(int newAge){//Создание Объекта
       Age = newAge;
   }
   public void setphone(String newphone){//Создание Объекта
       phone = newphone;
   }
}
