/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;

/**
 *
 * @author Alex Shustov
 */
public class ProgramControlLogicInterruptOperators {
    public static void main(String[]args){
        for(int f=0;f<=3;f++){
            System.out.println("Run");
        if(f<2){
            System.out.println("go");
            continue;//после условия возращается в цикл   
        }    
        }
    }
}
