/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula6marcelo2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Aula6Marcelo2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20;
        
        int[] array = new int [size];
        
        System.out.println("Digite 20 elementos do array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int soma = 0;
        for (int num : array) {
            soma += num;
    }
        double average = (double) soma / size;
        
        int max = array[0];
        int min = array[0];
        
        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        for (int i = 0; i < 20; i++) {
            if(array[i] < average) {
                System.out.println("Números menores que a média: " + array[i]);
            }
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + average);
        System.out.println("Máximo: " + max);
        System.out.println("Mínima: " + min);
        
        scanner.close();
    }
}
