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

public class Exercicios {

    /**
     * @eu;
     * 1)welcome.java: Faça um programa que exiba;
     * 2)SituacaoChuva.java:Faça um program que escreva na tela:
     * Está chovento S/N", caso o usúario digite S, então escreva -> " Você escolheu que está chovento", 
     * caso ao contrario -> " Você disse que não está chovendo";
     * 3)SobremesaElseIf.java: Faça um programa que pergunte qual sobremesa deseja, capture do usuário numero
     * escolhido e guarde em uma variavel, e compare com as opcões: 1- bombom,2-pudim,3-cafe), e apresente na
     * tela o resultado;
     * 4)SobremesaSwitch.java:Faça o mesmo programa com switch;
     * 5)Repeticaõ.java:Faça um programa que repita os números de um até dez na tela;
     */
 
   
    
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Welcome ClasseUm = new Welcome();
        SituacaoChuva ClasseDois = new SituacaoChuva();
        Sobremesas ClasseTres = new Sobremesas();
        Repeticao ClasseQuatro = new Repeticao();
        int option;
        
        Scanner ScannerClass = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|-----------------------------|");
        System.out.println(" Bem vindo ao kit de programas");
        System.out.println("|-----------------------------|");
        System.out.println("1-Bem vindo ao java \n2-Situação da Chuva \n3-Sobremesas \n4-Repetição");
        System.out.println("Por favor digite a opção que deseja acessa abaixo");
        option = ScannerClass.nextInt();
        switch(option){
            case 1:
                ClasseUm.print();
                break;
            case 2:
                ClasseDois.print();
                break;
            case 3:
                ClasseTres.print();
                break;
            case 4:
                ClasseQuatro.print();
                break;
                
   
        }
    }
    
    
}
