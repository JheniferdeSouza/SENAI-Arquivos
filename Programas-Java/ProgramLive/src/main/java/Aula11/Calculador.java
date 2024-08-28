/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author senai
 */
public class Calculador {
   

    private String resultado;
    private double peso,altura,IMC,pesoIdealMinimo,pesoIdealMaximo;
    
    public Calculador(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public void mostrarPeso(){
        
        System.out.println("Peso Ideal: "+pesoIdealMinimo+" - "+pesoIdealMaximo+" Peso: "+peso+" IMC: "+IMC+" de acordo com as informações solicitadas a pessoa está no grau: "+resultado);
    }
    
    void calcular(){
        IMC = peso/(altura*altura);
        pesoIdealMinimo=18.5*altura*altura;
        pesoIdealMaximo=24.9*altura*altura;
        
    }
    
    void determinaGrau(){
        if(IMC <= 18.5){
            resultado="Abaixo do peso ideal, necessita de atenção ";
        }
        else if(IMC > 18.5 && IMC <= 24.9){
            resultado="Peso ideal, parabéns continue assim...";
        }
        else if(IMC > 25 && IMC <= 29.9){
            resultado="Excesso de peso";
        }
        else if(IMC > 30 && IMC <= 34.9){
            resultado="Obesidade classe 1, bom ter cuidado para não passar para outro grau de obesidade";
        }
        else if(IMC > 35 && IMC <= 39.9){
            resultado="Obesidade classe 2, necessita de atenção";
        }
        else if(IMC > 40){
            resultado="Obesidade classe 3, Grau mais alto de obesidade necessita de atenção para não ter problemas de saúde";
        }
    }
    
}
