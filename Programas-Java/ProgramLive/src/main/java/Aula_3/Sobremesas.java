/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_3;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Sobremesas {

    /**
     * @param args the command line arguments
     */
    public static void print() {
        Scanner ScannerClass = new Scanner(System.in);
        int command;
        String option,escolhido ="";
        System.out.println("Escolha a versão: 1- switch ou 2-Ifs 0u 3-sair");
        command = ScannerClass.nextInt();
        System.out.println(" ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println(" ||**CARDARPIO DO DIA**||");
        System.out.println(" ________________________");
        System.out.println("    || ID | *NOME* ||");
        System.out.println("    || 01 | Bombom || \n    || 02 | Pudim  || \n    || 03 |  Café  || ");
        System.out.println(" ________________________");
        System.out.println("Faça seu pedido");
        option=ScannerClass.next();
        switch(command){
         case 1:
          switch(option){
              case "1":
                  escolhido ="Bombom";
                  System.out.println("Foi pedido um "+ escolhido);
                  break;
              case "2":
                  escolhido ="Pudim";
                  System.out.println("Foi pedido um "+ escolhido);
                  break;
              case "3":
                  escolhido ="Café"; 
                  System.out.println("Foi pedido um "+ escolhido);
                  break;
          }
         case 2:
             if(option.equals("1") || option.equals("Bombom"))
             {
                 escolhido ="Bombom";
                 System.out.println("Foi pedido um "+ escolhido);
             }
             if(option.equals("2") || option.equals("Pudim"))
             {
                 escolhido ="Pudim";
                 System.out.println("Foi pedido um "+ escolhido);
             }
             if(option.equals("3") || option.equals("Café"))
             {
                 escolhido ="Café";
                 System.out.println("Foi pedido um "+ escolhido);
             }
         case 3:
              Exercicios.menu();
        }
       
    }
}
        
        
        
        
    
