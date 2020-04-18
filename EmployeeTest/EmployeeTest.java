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
public class EmployeeTest {
    
    public static void main(String[]args){
        
        Employee[] instaff = new Employee[4];
        instaff[0]= new Employee("Alex shtefan",85000,1992,12,20);
        instaff[1]= new Employee("Sergei Semenov",90000,1971,04,11);
        instaff[2]= new Employee("Nikita Arshipov",75000,1995,06,15);
        instaff[3]= new Employee("Alexander Shafutinski",70000,1993,10,30);
        
        //Увеличение зарплаты на 15%
        for(Employee g:instaff){
            g.raiseSalary(15);
        }
        
        //Вывод данных об объектах типа Employee
        for(Employee g:instaff){
            System.out.println("Имя"+" "+g.getName()+",Зарплата="+" "+g.getSalary()+",День Поступления"+" "+g.getHireDay());
        }
    }
}
