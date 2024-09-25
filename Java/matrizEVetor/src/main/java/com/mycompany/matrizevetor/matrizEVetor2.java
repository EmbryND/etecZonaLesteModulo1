/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matrizevetor;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.Random;

public class matrizEVetor2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int numeroSecreto = random.nextInt(100) + 1;
    
    int[] tentativas = new int[100];
    int numTentativas = 0;
    boolean acertou = false;
    
    System.out.println("Bem-vindo ao jogo de Advinhe o Número!");
    System.out.println("Tente adivinhar o número secreto entre 1 e 100.");
    
    while (!acertou) {
        System.out.print("Digite sua tentativa: ");
        int tentativa = scanner.nextInt();
        tentativas[numTentativas] = tentativa;
        numTentativas++;
        
        if (tentativa == numeroSecreto) {
            System.out.println("Parabéns! Você adivinhou o número em " + numTentativas + "tentativas.");
            acertou = true;
        } else if (tentativa < numeroSecreto) {
            System.out.println("O número secreto é maior que " + tentativa + ".");            
        } else {
            System.out.println("O número secreto é menor que " + tentativa + ".");
        }
    }
    
    System.out.println("Suas tentativas:");
    for (int i = 0; i < numTentativas; i++) {
        System.out.print(tentativas[i] + " ");
    }
    System.out.println();
    
    scanner.close();
}
}
