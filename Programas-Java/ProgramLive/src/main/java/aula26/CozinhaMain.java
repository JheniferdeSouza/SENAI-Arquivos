/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula26;

/**
 *
 * @author senai
 * 
 * Classe: Crie uma classe pizza de queijo com 8 pedaços. 
 * Para este exercicio precisaremos criar um atributo sabor
 * com get/set.
 * Para este exercicio também precisaremos criar um método
 * chamado retira pedaços.
 * 
 * Main: Chamar o método oito vezes na main se não houver
 * mais pedaços, mostrar: "Não tem mais pedaço de pizza".
 */
public class CozinhaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
        PaoPizza PizzaBoa = new PaoPizza();
        
        System.out.println("-----------------------");
        System.out.println("BEM VINDO A SUA COZINHA");
        System.out.println("-----------------------");
        
        PizzaBoa.setValue("queijo", "média");
        System.out.println("Temos um pão pizza de " + PizzaBoa.getSabor() + " com " + PizzaBoa.getPedacos() + " Pedaços");
        
        PizzaBoa.removerPedacos(1);
        PizzaBoa.removerPedacos(4);
        PizzaBoa.removerPedacos(3);
        PizzaBoa.removerPedacos(1);
    }
    
}
