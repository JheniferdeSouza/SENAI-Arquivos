/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula30;

import java.util.ArrayList;

/**
 *
 * @author senai
 */
public class SelvaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passaro passaro1 = new Passaro("Gelvado");
        Passaro passaro2 = new Passaro("Alberti");
        Passaro passaro3  = new Passaro("Julia");
        ArrayList<Passaro> Revoada = new ArrayList<>();
        
        Revoada.add(passaro1);
        Revoada.add(passaro2);
        Revoada.add(passaro3);
        
        for(Passaro p : Revoada){
            p.voar();
        }
    }
    
}
