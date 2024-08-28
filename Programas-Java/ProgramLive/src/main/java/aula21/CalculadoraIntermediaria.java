/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula21;

import java.util.Scanner;

/**
 *
 * @author senai
 * 
 * Projeto Calculo
 * O projeto Calculo que possuir as operações: multiplicação,soma,subtração e divisão
 * 1.Receber dois valores
 * 2.Possuir as operações pedidas.
 * 3.Faze-ra todas as operações com os dois valores.
 * 4.Apresente os resultados em tela.
 */
public class CalculadoraIntermediaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b;
        Scanner ScannerClass = new Scanner(System.in);
        
        
        System.out.println("Digite o primeiro numero:");
        a=ScannerClass.nextDouble();
        System.out.println("Digite o segundo numero:");
        b=ScannerClass.nextDouble();
        
        System.out.println("....Calculando...");
        Operacoes OperacoesClass = new Operacoes(a,b);
        System.out.println("O resultado é:");
        System.out.println("Soma:"+OperacoesClass.soma());
        System.out.println("Subtração:"+OperacoesClass.subtracao());
        System.out.println("Multiplicação:"+OperacoesClass.multiplicao());
        System.out.println("Divisão:"+String.format("%.3f",OperacoesClass.divisao()));
        
    }
    
}
