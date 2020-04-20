/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticTest2.ParamTest;

/**
 *
 * @author Alex
 */
public class NewClassEmployee3 {
    private String name;
    private double salary;
    
    public NewClassEmployee3(String n,double s){
        name = n;
        salary = s;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise = salary * byPercent/100;
        salary+=raise;
    }
}
