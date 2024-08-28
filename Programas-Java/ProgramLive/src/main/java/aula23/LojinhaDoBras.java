/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author senai
 */
public class LojinhaDoBras {
    
    public static void main(String[] args){
        
        CamisaPolo ItemPromocional = new CamisaPolo("Abt","Crocodilo",25,5,"Lacoste");
        
        System.out.println("Bem vindo a lojinha do bras");
        ItemPromocional.mostrarDetalhes();
        ItemPromocional.calcularPreco();
        ItemPromocional.reabastecer(5);
        ItemPromocional.mostrarDetalhes();
        ItemPromocional.vender(4);
        ItemPromocional.mostrarDetalhes();
        
        
    }
}
