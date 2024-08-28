/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula24;

/**
 *
 * @author senai
 * 
 * Sistema de pilhas.
Criar uma classe de pilha em java e um enum com várias marcas de pilhas.
1.A classe pilha possui as propriedades privadas marca, (double) duracaoHoras,valor.
2.O enum possuir três marcas de pilhas(Duracell,Rayovac,ParaSonic,Energy)
3.A classe pilha possuir os métodos públicos (void)testar(), comprar(), guardar(),(não void)usar(double x).
4.O programa deverá exibir ; no método testar()-"testando pilhas", comprar()-dependendo da marca da pilha dever exibir o valor na main(), Usar() dever retorna para a main() a quantidade de bateria restante e printa na tela,Guarda()-"guardando pilha".

* Tabela de preços: Duracell = 9, Rayovac = 4, Energy = 1.50
* 
* ->Instancie uma pilha e execute os quatros metodos
* 
* Formula = duração-valor
* 
 * 
 */
public class SistemaDePilhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       System.out.println("-----------------");
       System.out.println("TABELA|DE|VALORES");
       System.out.println("-----------------");
       System.out.println("_____________________");
       System.out.println("|   Marca   |  Valor |");
       System.out.println("|____________________|");
       System.out.println("| Duracell  | R$9,00 |");
       System.out.println("| Rayovac   | R$4,00 |");
       System.out.println("| Energy    | R$1,50 |");
       System.out.println("_____________________");
       System.out.println("-----------------");
       PilhaTemplate pilhaEscolhida = new PilhaTemplate(MarcasDePilhas.Rayovac,6);
       pilhaEscolhida.testar();
       pilhaEscolhida.guarda();
       pilhaEscolhida.usar();
       pilhaEscolhida.comprar();
        
    }
    
}
