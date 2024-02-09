package com.mycompany.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
                 
        double areaTianguloRetangulo = ((A * C) / 2);        
                 
        System.out.printf("Triangulo: %.3f%n",  areaTianguloRetangulo);
        
        double areaCirculo = (3.14159 * (C * C));
        
        System.out.printf("Círculo: %.3f%n",  areaCirculo);
        
        
        double areaTrapezio = ((A+B) * C/2);
        
        System.out.printf("Trapézio: %.3f%n ", areaTrapezio);
        
        double areaQuadrado = (B*B);
        
        System.out.printf("Quadrado: %.3f%n ", areaQuadrado);
        
        double areaRetangulo = (A*B);
        
        System.out.printf("Retângulo: %.3f%n ", areaRetangulo);
        
        
        
        
         sc.close();
    }

}