/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz;

import java.util.Random;

/**
 *
 * @author tulio
 */
public class Matriz {

    public static void main(String[] args) {
        
        int[][] matriz = new int [3][4];
        Random random = new Random();
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10);
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 4; j++) {
                System.out.print( " " + matriz[i][j]);
            }
            
            System.out.println("");
            
        }
        
        int soma = 0;
        int somaImpares = 0;
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 4; j++) {
                
                soma = soma + matriz[i][j];
                
                if((matriz[i][j] %2) == 1){
                    
                    somaImpares = somaImpares + matriz[i][j];
                }
            }
            
        }
        
        System.out.println("Soma = " + soma);
        double media = (double) soma / 12;
        System.out.println("Media = " + media);
        System.out.println("A soma dos numeros impares = " + somaImpares);
        
    }
}
