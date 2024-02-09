

package br.com.appstrom.banco;

import java.util.Scanner;


public class Interest {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
                
        double amount;
        double principal = 1.000;
        double rate = 0.05;
        
        System.out.printf("%s%20s %n", "Year", "Amount on deposit");
        
        for(int year = 1; year <= 10; year++){
            
            amount = principal * Math.pow(1.0 + rate, year);
            
           System.out.printf("%4d%,20.4f%n", year, amount);
            
        }
        
    }
}
