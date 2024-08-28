/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_19;

/**
 *
 * @author senai
 */
public class Motors extends Veiculos{
    public Motors(String marca, String modelo){
       this.marca=marca;
       this.modelo=modelo;
    }
    public class Veiculos{
       int velocity = 60; 
    }
    
     void CompararVelocidade(){
        System.out.println("A velocidade do pai é: "+super.velocity);
        System.out.println("A velocidade do filho é: "+velocity);
    }
    
    void EmpinarMoto(){
        System.out.println("...Empinando Moto...");
    }
}
