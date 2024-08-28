/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula21;

/**
 *
 * @author senai
 */
public class Operacoes {
    double a,b;
    public Operacoes(double a, double b){
        this.a=a;
        this.b=b;
    }
    double soma(){
        return a+b;
    }
    double subtracao(){
        return a-b;
    }
    double multiplicao(){
        return a*b;
    }
    double divisao(){
        return a/b;
    }
}
