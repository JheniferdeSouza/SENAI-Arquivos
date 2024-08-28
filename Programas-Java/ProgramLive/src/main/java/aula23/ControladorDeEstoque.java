/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author senai
 */
public interface ControladorDeEstoque {
    boolean reabastecer(int quantidade);
    boolean vender(int quantidade);
    double calcularPreco();
}
