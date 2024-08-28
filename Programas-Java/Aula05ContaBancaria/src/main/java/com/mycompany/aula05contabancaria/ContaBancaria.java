/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05contabancaria;

/**
 *
 * @author senai
 */
public class ContaBancaria {
   
    /*Propriedades
    
    Métodos
    a) Construtor(dever possuir entrada de valores)
    b) MostraSaldo(void que não deve possuir entrada de valor)
    c) AdicionaValor(void que possui entrada de valor)
    D) SubtrairValor(void que possui entrada de valor)
    
    */
    
    double saldo;

    
    public ContaBancaria(double saldoDaContaAtual)
    {
        saldo = saldoDaContaAtual;
    }
    
    public void MostraSaldo()
    {
        
        System.out.println("O saldo atual da conta é: R$" + saldo );
    }
    
    public void Deposito(double valorAdicional)
    {
        saldo += valorAdicional;
        System.out.println("Foi adicionado na sua conta: R$" + valorAdicional );
        System.out.println("O saldo atual da conta é: R$" + saldo );
    }
    
    public void Saque(double valorDescontado)
    {
        saldo -= valorDescontado;
        System.out.println("Foi retirado da sua conta: R$" + valorDescontado );
        System.out.println("O saldo atual da conta é: R$" + saldo );
    }
}
