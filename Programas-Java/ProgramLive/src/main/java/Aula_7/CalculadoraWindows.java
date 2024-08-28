/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_7;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class CalculadoraWindows {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int escolha;
        float valor1;
        float valor2;
        
        Scanner ScannerClass = new Scanner(System.in);
        
        System.out.println("_______________");
        System.out.println("||CALCULADORA||");
        System.out.println("_______________");
        System.out.println("Operações Disponiveis:");
        System.out.println("|1|     Soma    |");
        System.out.println("|2|  Subtração  |");
        System.out.println("|3|Multiplicação|");
        System.out.println("|4|   Divisão   |");
        System.out.println("Opção desejada:");
        escolha = ScannerClass.nextInt();
        System.out.println("Atualmente disponivel somente até 2 valores");
        System.out.println("Valor 1:");
        valor1=ScannerClass.nextFloat();
        System.out.println("Valor 2:");
        valor2=ScannerClass.nextFloat();
        Operadores operacao = new Operadores(escolha,valor1,valor2);
        System.out.println("...Gerando resultado...");
        System.out.println(".......................");
        System.out.println("O resultado calculado foi: "+operacao.getResult());
        
    }
        
    
}
