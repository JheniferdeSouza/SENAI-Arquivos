/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21;

/**
 *
 * @author senai
 */
public class TemplateFinanciamento {
   
    
    int quantidadeDeParcelas,numeroDoContrato,entrada;
    double valorTotal,taxaDeJuros,valorFinal,valorDaParcela; 
    
    public TemplateFinanciamento(float valorTotal,int quantidadeDeParcelas,float entrada,int numeroDoContrato, double taxaDeJuros){
        this.valorTotal = valorTotal;
        this.quantidadeDeParcelas = quantidadeDeParcelas;
        this.numeroDoContrato = numeroDoContrato;
        this.taxaDeJuros = taxaDeJuros;
    }
    
    void Calculos(){
       double resultado;
       
       valorFinal = valorTotal*taxaDeJuros;
       valorDaParcela = quantidadeDeParcelas*(valorTotal - entrada);
       
    }
    public double[] RetornoDoResultado(){
        double[] resultado = new double[2];
        resultado [1] = valorDaParcela;
        resultado [2] = valorFinal;
        return resultado;
    }
}
