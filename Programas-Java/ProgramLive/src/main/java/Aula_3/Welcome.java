/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_3;
import java.util.Scanner;
/**
 *
 * @author senai
 */
public class Welcome {
    public static void print()
    {
      
       Scanner ScannerClass = new Scanner(System.in);
      System.out.println("Por favor digite seu nome");
      String name = ScannerClass.next();
      System.out.println("Hello word, " + name);
      Exercicios.menu();
      
    }
    
}
