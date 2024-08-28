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
public class SituacaoChuva {
    public static void print(){
       
        Scanner ScannerClass = new Scanner(System.in);
        
        System.out.println("Informe se está chovendo(Sim-S,Não-N)");
        String option=ScannerClass.next();
        if(option.equals( "S") || option.equals("Sim") ){
             System.out.println("Você disse que está chovendo");
        }
        else if(option.equals( "N") || option.equals("Não") ){
             System.out.println("Você disse que não está chovendo");
        }
        Exercicios.menu();
            
    }
}
