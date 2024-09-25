/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrizevetor;

/**
 *
 * @author Admin
 */
public class MatrizEVetor {

    public static void main(String[] args) {
        int semanas = 5;
        int diasPorSemana = 7;
        
        int[][] calendario = new int[semanas] [diasPorSemana];
        
        int dia = 1;
        boolean mesIniciado = false;
        
        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < diasPorSemana; j++) {
                if (i == 0 && j <5) {
                    calendario[i][j] = 0;
                } else if (dia <= 30) {
                    calendario[i][j] = dia++;
                } else {
                    calendario[i][j] = 0;
                }
            }
        }
        
        String[] diasDaSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sab"};
        System.out.println("Calendário de Junho 2024:");
        for (String diaDaSemana : diasDaSemana) {
            System.out.print(diaDaSemana + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < semanas; i++) {
            for (int j = 0; j < diasPorSemana; j++) {
                if (calendario[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(calendario[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
