/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_5;

import java.util.Scanner;

/**
 *
 * @author senai
 * 
 * Auxiliar de lançamentos das notas
 * 
 * Um campo com entrada de dados.
 * Um comparativo de maior que 7
 * Um calculo de média(soma das notas/quantidade de notas).
 * Um calculo da média da sala.
 * 
 */
public class CentralDeNotas {

    static Scanner ScannerClass = new Scanner(System.in);
    static int Alunos = 0;
    static double[] notasTotais = new double[11];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CalculosDeNotas();
    }
    
    static void CalculosDeNotas()
    {
        //Não está aceitando numero com virgula
        Boolean Continue = true;
        int i = 0;
        double[] notas = new double[5];
        while(Continue == true && i < 5)
        {
            
            System.out.println("Deseja inserir uma nota?(1-Sim ou 2-Não)Máximo 5");
            int Input = ScannerClass.nextInt();
            double SomaDasNotas = 0;
            switch(Input)
            {
                case 1:
                    System.out.println();
                    notas[i] = ScannerClass.nextDouble();
                    notasTotais[i] = notas[i];
                    System.out.println(i);
                    System.out.println(notas[i]);
                    i++;
                    break;
                case 2:
                    for( int a = 0; a<i; a++)
                    {
                        SomaDasNotas += notas[a];
                        if(notas[a]>=7.0){
        
                          System.out.println("nota: " + notas[a] +" Aprovado");  
                        }
                        else{
                          
                          System.out.println("nota: " + notas[a] +" Reprovado");  
                        }
                    }
                    double mediaSingular = SomaDasNotas/i;
                    System.out.println("Sua média é: " + mediaSingular);
                    
                    Continue = false;
                    break;
            }
            
        }
    }
    
    static void CalculoDeMédiaDaClasse()
    {
        
    
    }
    
}
