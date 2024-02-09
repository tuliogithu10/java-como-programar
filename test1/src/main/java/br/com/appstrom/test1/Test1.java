
package br.com.appstrom.test1;

import java.util.Locale;
import java.util.Scanner;


public class Test1 {

    public static void main(String[] args) {
      
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        double diferenca = (A*B - C*D);
        
        System.out.println("DIFERENCA = " + diferenca);       
                
         
        sc.close();
    }
}
