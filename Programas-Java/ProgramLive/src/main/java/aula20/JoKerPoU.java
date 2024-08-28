/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20;


import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author senai
 */

public class JoKerPoU {

    /**
     * @param args the command line arguments
     */
           
    public static void main(String[] args) {
         int result;
         int choicePlayer;
         
         Scanner ScannerClass = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.println("Escolha qual será su jogada: 0-pedra || 1-papel|| 2-tesoura");
        choicePlayer=ScannerClass.nextByte();
        result = aI(choicePlayer);
        if(result !=3){
        System.out.println("o ganhador é " + (result == 0 ? "Jogador" : "Maquina"));
        }
        else{
            System.err.println("Empate!");
        }
    }
    
    static int aI( int resultUser){
        int choosenIA;
        int result = 6;
      
        
        
        //Escolha
        Random RandomClass = new Random();
        choosenIA = RandomClass.nextInt(2);
        
        //Determinação do vencedor;
        switch(choosenIA){
            case 0:
                System.out.println("Maquina escolheu: pedra");
                if( resultUser==1 ){
                    result = 0;
                    System.out.println("Jogador escolheu: papel");
                }
                else if(resultUser==2){
                    result = 1;
                    System.out.println("Jogador escolheu: tesoura");
                }
                else if(resultUser==0){
                    System.out.println("Jogador escolheu: pedra");
                    result = 3;
                }
                break;
            case 1:
                System.out.println("Maquina escolheu: papel");
                 if( resultUser==2 ){
                    result = 1;
                    System.out.println("Jogador escolheu: Tesoura");
                }
                else if(resultUser==0){
                    result = 0;
                    System.out.println("Jogador escolheu: pedra");
                }
                else if(resultUser==1){
                    result = 3;
                    System.out.println("Jogador escolheu: papel");
                }
                 break;
            case 2:
                System.out.println("Maquina escolheu: tesoura");
                    if(resultUser == 1){      
                        result = 0;
                        System.out.println("Jogador escolheu: pedra");
                        
                    }
                    else if(resultUser == 2){
                        result = 1;
                        System.out.println("Jogador escolheu: papel");
                    }
                    else if(resultUser ==0){
                        result = 3;  
                        System.out.println("Jogador escolheu: tesoura");
                    }
                    break;
                        
        } 
        return result;
    }
    
    
}
