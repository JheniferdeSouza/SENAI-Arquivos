/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_09;

/**
 *
 * @author senai
 */

import java.util.Scanner;
        
public class SistemaDeAmbiente {

    /*Sala de Aula:
    1)ter uma janela
    2)Abrir a janela
    3)Fechar a janela
    4)Mostra a situação da Janela
    Janela:
    1)Situação
    2)Abrir a janela
    3)Fechar a janela
    4)Mostrar a situação da janela
    */
    /**
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        Scanner ScannerClass = new Scanner(System.in);
        
    
        int quantidadeDeJanelas;
        int isrunner = 1;
        
        System.out.println("Primeiro vamos criar uma sala:");
        System.out.println("Digite a quantidade de janelas:");
        quantidadeDeJanelas = ScannerClass.nextInt();
        System.out.println("...Criando sala...");
        SalaDeAula Sala1 = new SalaDeAula(quantidadeDeJanelas);
        System.out.println("...Criado com sucesso!...");
        System.out.println("sala com "+Sala1.MostraQuantidadeJanelas()+" Janela(s)");
        Janela Janela = new Janela();
        do{
            Menu(Janela);
            System.out.println("Deseja sair do programa?1-sim ou 2-nao");
            isrunner=ScannerClass.nextInt();
        }while(isrunner==2);
    }
    
    static void Menu(Janela JanelaAtual){
        Scanner ScannerClass = new Scanner(System.in);
        int option;
        
        System.out.println("O que deseja fazer com a janela? 1-Abrir .\n 2-Fecha .\n 3- Mostra a situação da Janela ");
        option = ScannerClass.nextInt();
        if(option == 1){
            JanelaAtual.AbrirJanela();
        }
        if(option == 2){
            JanelaAtual.FechaJanela();
        }
        else if(option == 3){
            System.out.println(JanelaAtual.MostraSituacao());
        }
    }
    
}
