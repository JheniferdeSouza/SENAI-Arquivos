/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_8;

/**
 *
 * @author senai
 */
public class Ambiente {

    /**
     * Ventilador:
     *  1)Número de pás
     *  2)Velocidade
     *  3)Girar
     *  4)Mostra Velocidade
     * 
     * Sala de Aula:
     *  1)Ter um ventilador
     *  2)Girar na velocidade 1
     *  3)Mostrar a velocidade
     */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int quantidadeDeVentiladores = 1;
        System.out.println("...Abrindo a sala....");
        System.out.println("Há " + quantidadeDeVentiladores + " ventilador(s)");
        Ventilador Ventilador1 = new Ventilador(1);
        Ventilador1.Girar();
        Ventilador1.MostrarVelocidade();
    }
    
    
    
}
