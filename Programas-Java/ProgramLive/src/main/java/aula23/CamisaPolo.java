/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula23;

/**
 *
 * @author senai
 */
public class CamisaPolo extends Produto {

    private String marca;
    
    public CamisaPolo(String id, String nome, double preco, int quantidade, String marca) {
        super(id, nome, preco, quantidade);
        this.marca = marca;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("|ID: " +id+"|");
        System.out.print("|Nome: " +nome+"|");
        System.out.print("|Marca: " +marca+"|");
        System.out.print("|Preço: " +preco+"|");
        System.out.print("|Quantidade em estoque: " +quantidade+"|");  
    }
    
}
