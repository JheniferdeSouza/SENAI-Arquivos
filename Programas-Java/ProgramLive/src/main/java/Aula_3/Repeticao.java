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
public class Repeticao {
    public static void print()
    {
    
      Scanner ScannerClass = new Scanner(System.in);
      int option ;
      int i = 0;
      System.out.print("Digite 1 para começa a contagem ou 2 para sair");
      option = ScannerClass.nextInt();
      if(option == 1)
      {
          do{
              System.out.println(i);
              i++;
              if(i==5)
              {
                 System.out.print("Metade do tempo");
              }
          }
          while(i<10);
          print();
      }
      if(option == 2){
          Exercicios.menu();
      }
    }
    
}
