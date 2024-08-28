/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula11;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Emagrecimento2023 {

    /**
     * @param args the command line arguments
     * Projeto Emagrecimento Alienígena 
     * Criar o IMC e a main
     * 
     * IMC(Classe):
     * 1)resultado
     * 2)Calcular
     * 3)MostrarPeso
     * 
     * Main(main):
     * 1)Ter um IMC
     * 2)Calcula IMC
     * 3)Mostar o resultado
     *
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        double pesoAtual;
        double alturaAtual;
        Scanner ScannerClass = new Scanner(System.in);
        
        System.out.println("-----------------------------------");
        System.out.println("Seja bem vindo a calculadora de IMC");
        System.out.println("-----------------------------------");
        System.out.println("Informe seu peso:");
        pesoAtual = ScannerClass.nextDouble();
        System.out.println("Informe sua altura:");
        alturaAtual = ScannerClass.nextDouble();
        System.out.println("....Gerando resultado....");
        Calculador Calculador = new Calculador(pesoAtual,alturaAtual);
        Calculador.calcular();
        Calculador.determinaGrau();
        Calculador.mostrarPeso();
    }
    
}
