/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula26;

/**
 *
 * @author senai
 * 
 */
public class PaoPizza {
    
    private int quantidadeDePedacos;
    private String tamanho,sabor;
    
    
    void obterPedacos(String tamanho){
        switch (tamanho){
            case "brotinho":
            {
                quantidadeDePedacos = 4;
                break;
            }
            case "média":
            {
                quantidadeDePedacos = 8;
                break;
            }
            case "grande":
            {
                quantidadeDePedacos = 12;
                break;
            }
        }
    }
    
    void removerPedacos(int quantidadeCortado){
        if(quantidadeCortado < quantidadeDePedacos){
            quantidadeDePedacos-=quantidadeCortado;
            System.out.println("Tirou, tem ainda "+quantidadeDePedacos +" pedaços ");
        }
        else if(quantidadeCortado == quantidadeDePedacos){
            quantidadeDePedacos-=quantidadeCortado;
            System.out.println("!!!Ultimo pedaço!!!");
        }
        else if(quantidadeCortado > quantidadeDePedacos){
            System.out.println("Não tem pedaços suficientes");
        }
    }
    
     public void setValue(String sabor, String tamanho){
      this.tamanho = tamanho;
      this.sabor = sabor;
      obterPedacos(tamanho);
    }
    
    public String getSabor(){
        return sabor;
    }
    
    public int getPedacos(){
        return quantidadeDePedacos;
    }
}
