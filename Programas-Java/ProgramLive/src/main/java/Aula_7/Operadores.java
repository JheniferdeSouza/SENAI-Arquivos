/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_7;

/**
 *
 * @author senai
 */
public class Operadores{
    
    float resultado;
    
    public Operadores(int opcaoAtual, float valor1Atual, float valor2Atual){
     

        switch(opcaoAtual){
            case 1:
                resultado = valor1Atual+valor2Atual;

                break;
                
            case 2:
                resultado = valor1Atual-valor2Atual;
                break;
            case 3:
                resultado = valor1Atual*valor2Atual;
                break;
            case 4:
                resultado = valor1Atual/valor2Atual;
                break;
        }

    }
    
    public double getResult(){
        
        return resultado;
    }
    
    
}
