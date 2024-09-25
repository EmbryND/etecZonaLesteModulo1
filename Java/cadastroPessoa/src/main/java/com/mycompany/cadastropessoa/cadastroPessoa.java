/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastropessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class cadastroPessoa {
    public static void main(String agrs[]){
        
        String nome, curso, escola_tecnica;
        int idade = 0;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        curso = JOptionPane.showInputDialog("Digite seu curso:");
        escola_tecnica = JOptionPane.showInputDialog("Digite o nome da escola técnica: ");
        
        System.out.println("Nome: " + nome);
        System.out.println("\nIdade: " + idade);
        System.out.println("\nCurso: " + curso);
        System.out.println("\nEscola técnica: " + escola_tecnica);
        
        if (idade >= 18) {
        System.out.println("Você é maior de idade");
        
        } else {
        System.out.println("Vocè é menor de idade");
        }
    }
}
