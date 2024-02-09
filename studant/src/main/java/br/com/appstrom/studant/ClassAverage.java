
package br.com.appstrom.studant;

import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int gradeCounter = 0;
        
        System.out.print("Enter grade or -1 to quit: ");
        int grade = sc.nextInt();
        
        while (grade != -1){
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            
            System.out.print("Enter grade ot -1 to quit: ");
            grade = sc.nextInt();
            
        }
        
        if(gradeCounter != 0){
            
            double average = (double) total / gradeCounter;
            
            System.out.println("Total of the " + gradeCounter + " grades entered is " + total);
           
            System.out.printf("Class avarege is %.2f%n", average);     
        }                        
        else
            System.out.println("No grades were entered");
                
    }
}
