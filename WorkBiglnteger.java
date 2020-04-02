/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaprog;
import java.util.*;
import java.math.*;
/**
 *
 * @author Alex
 */
public class WorkBiglnteger {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько чисел вам нужно написать");
        int a = scan.nextInt();
        System.out.println("Какое наибольшее число вы можете написать?");
        int f = scan.nextInt();
        BigInteger lotteryOdds = BigInteger.valueOf(1);
        for(int i =1;i<=a;i++){
           lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(f-i+1)).divide(BigInteger.valueOf(i));
        System.out.println("Ваши шансы"+" "+lotteryOdds);
        }
    }
}
