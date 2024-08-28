/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula_09;

/**
 *
 * @author senai
 */
public class Janela {
    
    private String situacaoJanela;
    
    void AbrirJanela(){
        situacaoJanela = "Aberta";
        System.out.println("...Abrindo janela...");
    }
    
    void FechaJanela(){
        situacaoJanela = "Fechada";
        System.out.println("...Fechando janela...");
    }
    
    public String MostraSituacao(){
        return situacaoJanela;
    }
}
