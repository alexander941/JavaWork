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
public class ParamTest {
    public static void main(String[]args){
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Значение До: проценты ="+percent);
        tripleValue (percent);
        System.out.println("Значение После: проценты =" + percent);
        
        System.out.println("\nTesting tripleSalary:");
        NewClassEmployee3 sergei = new NewClassEmployee3 ("Сергей", 50000);
        System.out.println("Значение До: salary=" + sergei.getSalary ());
        tripleSalary(sergei);
        System.out.println("Значение После: salary»" + sergei.getSalary ());
        
        System.out.println("\nTesting swap:");
        NewClassEmployee3 alex = new NewClassEmployee3 ("Александр", 30000);
        NewClassEmployee3 vick = new NewClassEmployee3 ("Виктор", 50000);
        System.out.println("Значение До: a=" + alex.getName ( ) ) ;
        System.out.println("Значение После: b=" + vick.getName ());
        swap (alex, vick);
        System.out.println("Значение После: a=" + alex.getName ());
        System.out.println("Значение После: b=" + vick.getName ());
    }
    public static void tripleValue (double x){
        
    }
    public static void tripleSalary(NewClassEmployee3 x){
        x.raiseSalary(200);
        System.out.println("Конечный метод зарплаты"+x.getSalary());
    }
    public static void swap (NewClassEmployee3 x,NewClassEmployee3 y){
        NewClassEmployee3 temp =x;
        x=y;
        y=temp;
        System.out.println("Конечный метод x="+" "+x.getName());
        System.out.println("Конечный метод y="+" "+y.getName());
    }

}
