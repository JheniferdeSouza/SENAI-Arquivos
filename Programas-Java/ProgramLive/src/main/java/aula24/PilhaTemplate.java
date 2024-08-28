/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula24;

/**
 *
 * @author senai
 */
public class PilhaTemplate {
    MarcasDePilhas tipoDePilha;
    double duracaoHoras;
    double QuantidadeRestante;
    
    public PilhaTemplate(MarcasDePilhas tipoDePilha, int duracaoHoras){
        this.tipoDePilha = tipoDePilha;
        this.duracaoHoras= duracaoHoras;
    }
    
    void testar(){
        System.out.println("...testando pilha...");
    }
    
    void comprar(){
        switch(tipoDePilha){
            case Energy:
                System.out.println("Comprado: Pilha Simples" + " R$ "+ (duracaoHoras-1.5)); 
                break;
            case Rayovac:
                System.out.println("Comprado: Pilha Intermediaria"+" R$ "+(duracaoHoras-4));
                break;
            case DuraCell:
                System.out.println("Comprado: Pilha Luxo"+" R$ "+(duracaoHoras-9));
                break;
        }
    }
    void usar(){
        switch(tipoDePilha){
            case Energy:
                duracaoHoras -= 0.7; 
   
                break;
            case Rayovac:
                duracaoHoras -= 0.5;
         
                break;
            case DuraCell:
                duracaoHoras -= 0.25; 
                
                break;
        }
        System.out.println("Quantidade de bateria restante após utilizar:"+duracaoHoras);
    }
    
    void guarda(){
        System.out.println("...Guardando pilha...");
    }
    
    public double getQuantidadeRestante(){
       return QuantidadeRestante;
    }
    
}
