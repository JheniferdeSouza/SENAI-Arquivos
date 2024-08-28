/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_19;

/**
 *
 * @author senai
 * 
 * Crie uma superClasse chamada Veiculo com os camps marca,modelo e o método void acelerar(). 
 * Este método tem por objetivo populat valor true em acelerando e escrever: Acelerando...
 * 
 * Em seguida, crie duas subclasses Carro e Moto que herdam de Veiculo e adicionam seus pró-
 * prios métodos especificos. Use a herança a palavra-chave super e o override de métodos pa-
 * ra demostrar seu entendimento.
 */
public class Veiculos {
    int velocity;
    String marca,modelo;
    Boolean isAcceleration;
    
    void acelerar()
    {
        isAcceleration = true;
        velocity = 20;
        System.out.println("Acelerando.... vrum vrum....");
    }
}
