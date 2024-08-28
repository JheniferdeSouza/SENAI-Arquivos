/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_18;

/**
 *Fazer dois vetores a e b e multiplicar os valores contidos nos indices.
 * @author senai
 */
public class Array {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] a = {0,1,2,3,4,5,6,7,8,9,10};
         int[] b = {1,2,3,4,5};
         System.out.println("Tabuada do 1 ao 5");
         for(int i = 0; i<a.length; i++){
             for(int in = 0;in<b.length;in++){
                 System.out.print("| "+(in+1)+"x"+i+"="+(b[in]*a[i])+" |");
             }
             System.out.println(" ");
         }
    }
    
}
