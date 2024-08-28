/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula11;
import java.util.Scanner;
/**
 *
 * @author senai
 * 
 * Projeto AreaCirculo
 * 
 * Circulo(classe):
 * 1)raio // variável privada
 * 2)cor(opcinal) //variável privada com uma entrada
 * 3)MostrarArea //resultado
 * 
 * main(main):
 * 1) ter um circulo de cor azul
 * 2) Digitar o raio do circulo
 * 3)Mostra o resultado
*/
public class CalculoDeCirculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double raio;
        Scanner ScannerClass = new Scanner(System.in);
        Circulo circulo1 = new Circulo("Azul");
        
        System.out.println("-------------------------------------------");
        System.out.println("Bem vindo a calculadora de area de circulos");
        System.out.println("-------------------------------------------");
        System.out.println("Digite o raio:");
        raio=ScannerClass.nextDouble();
        System.out.println("...Calculando Resultado...");
        circulo1.calcula(raio);
        circulo1.MostraArea();
        
        
    }
    
}
