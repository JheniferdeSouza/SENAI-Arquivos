/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula11;

/**
 *
 * @author senai
 */
public class Circulo {

    double area;
    String cor;
    
    public Circulo(String cor){
        this.cor = cor;
    }
    
    void calcula(double raio){
        area=3.14*(raio*raio);
    }
    
    void MostraArea(){
        System.out.println("A area do circulo " + cor +" é: "+area);
    }
}

