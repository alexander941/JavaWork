/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticTest2;

/**
 *
 * @author Alex
 */
public class NewClassEmploye2 {
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;
    
    public NewClassEmploye2(String n,double s){
        name=n;
        salary = s;
        id = 0;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        id = nextId;// Установка следующего доступного индефикатора
        nextId++;
    }
    public static int getNextId(){
        return nextId; // возвращение поля индефикатора
    }
    public static void main(String[]args){ // тест
        NewClassEmploye2 e = new NewClassEmploye2("Sergei",39000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
