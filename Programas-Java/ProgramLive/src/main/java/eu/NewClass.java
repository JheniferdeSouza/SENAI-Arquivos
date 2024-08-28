/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class NewClass {
    static int hungry=2;
    static String command;
    static Scanner ScannerClass = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Ola, qual seu nome?");
        System.out.println("Fome: " + hungry);
        System.out.println("O que você quer fazer?");
        
        System.out.println("O que você quer fazer?");
        while()
        {
            Input();
        }
        
         
    }
    
    public static void Input(){
        String option;
        Status();
        System.out.println("De o comando:");
        option =ScannerClass.next().toUpperCase();
        if(option.equals("EAT")){
            Eat();
            System.out.println("Satisfeito!");
        }  
    }
    
    public static void Eat( )
    {
        do{
            System.out.println("Comendo...");
            hungry++;
        }
        while(hungry<=5); 
    }
    
    public static void Status()
    {
        switch(hungry){
            case 2 -> System.out.println("Fome baixa");
        
            case 5 -> System.out.println("Fome boa");
        
        }
    }
}
