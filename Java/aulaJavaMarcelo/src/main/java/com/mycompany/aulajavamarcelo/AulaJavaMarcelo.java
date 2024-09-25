/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulajavamarcelo;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class AulaJavaMarcelo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, endereco, telefone, escola, curso;
                System.out.print("Digite seu nome: ");
                nome = teclado.next () + teclado.nextLine ();
                System.out.print("Digite seu endereço: ");
                endereco = teclado.next () + teclado.nextLine ();
                System.out.print("Digite seu telefone: ");
                telefone = teclado.next () + teclado.nextLine ();
                System.out.print("Digite sua escola: ");
                escola = teclado.next () + teclado.nextLine ();
                System.out.print("Digite seu curso: ");
                curso = teclado.next () + teclado.nextLine ();
            System.out.println("Nome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nEscola: " + escola + "\nCurso: " + curso);
            String observacoes
    }
}
