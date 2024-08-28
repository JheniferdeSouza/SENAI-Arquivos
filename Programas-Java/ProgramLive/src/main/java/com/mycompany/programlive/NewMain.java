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
public class NewMain {
    public static void main(String[] args){
        
        String nome;
        double base,altura,area;
        Scanner ScannerClass = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        nome =ScannerClass.next();
        System.out.println("Bem vindo, " + nome + " a calculadora de area de triangulo");
        System.out.println("Digite a base");
        base =ScannerClass.nextDouble();
        System.out.println("Digite a altura");
        altura =ScannerClass.nextDouble();
       
        
        area=base*altura;
        
        System.out.println("a area é" + area);
        
    }
    
}
