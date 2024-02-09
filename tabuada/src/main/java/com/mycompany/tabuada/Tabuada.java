/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;

/**
 *
 * @author tulio
 */
public class Tabuada {

    public static void main(String[] args) {
        
        int [][] tabuada = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                tabuada[i][j] = i * j;
            }
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                System.out.print(tabuada[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
