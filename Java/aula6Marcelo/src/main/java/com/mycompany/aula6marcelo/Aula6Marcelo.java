/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula6marcelo;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Aula6Marcelo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = 10;
        
        int[] array = new int[size];
        
        System.out.println("Digite 10 elementos do array: ");
        for (int i = 0; i < size; i++) {
        array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
        System.out.println(array[i]);
        }
    }
}
