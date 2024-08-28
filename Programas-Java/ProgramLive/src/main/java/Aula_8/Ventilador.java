/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_8;

/**
 *
 * @author senai
 */
public class Ventilador {

    /**
     * @param args the command line arguments
     */
    
    int numeroDePas;
    double velocidade = 0;
    boolean estaGirando;
    
    public Ventilador(double velocidadeAtual){
        velocidade = velocidadeAtual;
    }
    
    void Girar(){
        if(estaGirando == false){
            if(velocidade!=0){
                System.out.println("...Ligando..");
            }
            else
            {
                System.out.println("Gire o botão de velocidade!!!");
            }
        }
        else if(estaGirando == true){
            System.out.println("...Desligando...");
        }
    }
    void MostrarVelocidade(){
        if(velocidade!=0){
                System.out.println("Velocidade atual: " + velocidade);
            }
            else
            {
                System.out.println("Ventilador está desligado");
            }
       
    }
}
        