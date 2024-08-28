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
public class Representantes {

    /**
     * @param args the command line arguments
     */
     
    static Scanner ScannerClass = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite sua resposta abaixo");
        int i = ScannerClass.nextInt();
        switch(i){
                case 1:
                    System.out.println("Regina");
                    break;
                case 2:
                    System.out.println("Isabeli");
                    break;
                case 3:
                    System.out.println("Igor");
                    break;
        }      
    }
    
}
