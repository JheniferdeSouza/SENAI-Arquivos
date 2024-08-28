/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.programlive;

import java.util.Scanner;
/**
 *
 * @author senai
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        String sexo;
        String tipoDeIMC;
        double peso,altura;
        
        Scanner ScannerClass = new Scanner(System.in);
        
        System.out.println("Bem vindo, a calculadora de IMC");
        System.out.println("Precisamos de algumas informações antes de começamos a calcular");
        System.out.println("Por favor digite as informações solicitadas");
        
        System.out.println("Seu Nome:");
        nome =ScannerClass.next("Seu nome");
        System.out.println("Seu sexo");
        sexo =ScannerClass.next("Seu sexo");
        
        System.out.println("Seu Peso:");
        peso =ScannerClass.nextDouble();
        System.out.println("Sua Altura");
        altura =ScannerClass.nextDouble();
        
        double IMC = peso/(altura*altura);
        AvaliacaoBiotica(IMC,sexo);
        System.out.println("seu IMC é"+ String.format("%.2f",IMC)+" estando "+tipoDeIMC);
        
       
        
    }
    
    public String AvaliacaoBiotica ( double IMC,String se){
        String tipoDeIMC;
        if(se =="F"){
            if(17<= IMC)
            {
                tipoDeIMC = " magreza extrema";
            }
            if(17> IMC  && IMC <= 18.49)
            {
                tipoDeIMC = " com um peso abaixo";
            }
            if(18.5> IMC  && IMC <= 25)
            {
                tipoDeIMC = " com um bom peso";
            }
             if(25> IMC  && IMC <= 30)
            {
                tipoDeIMC = " acima do peso";
            }
             if(30> IMC  && IMC <= 35)
            {
                tipoDeIMC = " obesidade";
            }
             if(35> IMC  && IMC <= 40)
            {
                tipoDeIMC = " obesidade severa";
            }
             if( IMC <= 40)
            {
                tipoDeIMC = " obesidade mórbita";
            }
        }
        if(se =="M"){
            
        }
        return tipoDeIMC;
    }
    
}
