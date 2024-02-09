package br.com.tulio;

import java.util.Random;


public class Vetor1 {

    public static void main(String[] args) {
        
        int[] vetorInteiro = new int[4];
        Random random = new Random();
        
        for (int i = 0; i < 4; i++) {
            
            vetorInteiro[i] = random.nextInt(10);
            
            
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println(vetorInteiro[i]);
        }
        
 
        int soma = 0;
        int somaPar = 0;
        for (int i = 0; i < 4; i++) {
            
            soma = soma + vetorInteiro[i];
            
            if((vetorInteiro[i] %2) == 0) {
                somaPar = somaPar + vetorInteiro[i];
             
            }   
            
        }
        System.out.println("Soma = " + soma);
        double media = (double) soma / vetorInteiro.length;
        System.out.println(media);
        System.out.println(" A soma dos numeros pares é = " + somaPar);

    }
}
