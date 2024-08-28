/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_10;

/**
 *
 * @author senai
 */
public class MaiorQue5 {
    //Criação de um vetor
    //Maior que 5 e menor que 5
    
    public static void main(String[] args){
        int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<9;i++)
        {
            if(numeros[i]>5){
                System.out.println("Numero: "+numeros[i] + " da " + (i+1) + " posição é maior que 5");
            }
            if(numeros[i]<5){
                System.out.println("Numero:"+numeros[i] + " da " + (i+1) + " posiçao é menor que 5");
            }
            if(numeros[i]==5){
                System.out.println("Numero:"+numeros[i] + " da " + (i+1) + " posição é igual a 5");
            }
        }
    }
    
}
