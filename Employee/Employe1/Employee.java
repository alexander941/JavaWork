/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *  EmployeeTest
 * @author Alex
 */
class Employee {
    private String name;
    private double salary;
    private Date hireDay;
    
    public Employee(String n,double s,int year,int month,int day){
        name = n;
        salary = s;
        
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }
    
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public Date getHireDay(){
        return hireDay;
    }
    
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
