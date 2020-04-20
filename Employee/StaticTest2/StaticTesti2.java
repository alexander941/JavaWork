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
public class StaticTesti2 {
    
    public static void main(String[]args){
        NewClassEmploye2 [] gistaff = new NewClassEmploye2[4];
        gistaff [0] = new NewClassEmploye2("Alex",77000);
        gistaff [1] = new NewClassEmploye2("Tom",42000);
        gistaff [2] = new NewClassEmploye2("Denis",58000);
        gistaff [3] = new NewClassEmploye2("Anton",61000);
        
        //Вывод данных о всех объектах NewClassEmploye2
        for(NewClassEmploye2 e:gistaff){
            e.setId();
            System.out.println("Имя="+e.getName()+",id"+e.getId()+",Зарплата"+e.getSalary());
        }
        int g = NewClassEmploye2.getNextId();// Вызываем метод
        System.out.println("Следующий доступный идентификатор" + " "+g);
    }
}
