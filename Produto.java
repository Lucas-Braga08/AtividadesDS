/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.produto;

import java.util.Scanner;

public class Produto {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("Calculo de preços");
        
        System.out.print("Digite o nome de um produto: ");
        String nome = valor.next();
        
        System.out.print("Agora digite o preço do produto: ");
        double preco = valor.nextDouble();
        
        double desconto = calcularDesconto(preco);
        
        System.out.println("O produto " + nome + " custa " + desconto + " com um desconto de 15% aplicado" );
    }
    public static double calcularDesconto(double preco) {
        return preco - (preco * 0.15);
    }
}