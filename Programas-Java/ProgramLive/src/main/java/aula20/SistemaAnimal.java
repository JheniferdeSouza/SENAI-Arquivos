/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20;

/**
 *
 * @author senai
 * 
 * 1.Animal,Gato,Cachorro,Main
 * 2.Miar o gato
 * 3.Latir o cachorro
 * 4.Alimentar os dois
 * 5. Se os animais já tiver comido não permitir que coma de novo
 * 
 */
public class SistemaAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato Gatinho = new Gato();
        Cachorro Cachorrinho = new Cachorro();
        Cachorrinho.alimentar();
        Cachorrinho.alimentar();
        Gatinho.alimentar();
        Gatinho.alimentar();
    }
    
}
