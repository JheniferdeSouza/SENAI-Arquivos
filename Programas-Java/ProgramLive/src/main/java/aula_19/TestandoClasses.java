/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_19;

/**
 *
 * @author senai
 */
public class TestandoClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carros Carrinho = new Carros("Azur","Bi564");
        Motors Motinho = new Motors("Garcia","573fgh");
        Veiculos VeiculoClass = new Veiculos();
        
        VeiculoClass.acelerar();u
        
        Carrinho.CompararVelocidade();
        Carrinho.abrirPortasMalas();
        
        Motinho.CompararVelocidade();
        Motinho.EmpinarMoto();
    }
    
}
