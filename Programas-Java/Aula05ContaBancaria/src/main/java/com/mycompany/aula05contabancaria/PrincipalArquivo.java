/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula05contabancaria;
import java.util.Scanner;


/**
 *PrincipalArquivo
 * @author senai
 */
public class PrincipalArquivo {

    boolean isRunnig = true;
    public static void main(String[] args) {
        
        double saldoInicial;
        
        Scanner ScannerClass = new Scanner(System.in);
        

        System.out.println("---------------");
        System.out.println("BANCO-BRASIL");
        System.out.println("---------------");
        System.out.println("Bem vindo ao Banco, \n o banco da familia");
        System.out.println("Por favor insira o saldo inicial");
        saldoInicial=ScannerClass.nextDouble();
        ContaBancaria  contaDoUsuario = new ContaBancaria(saldoInicial);
        while(isRunning == true)
        {
            Menu();
        }
       
    }
    
    public void Menu()
    {
         System.out.println("Escolha o que deseja fazer");
         System.out.println("1-Mostra saldo \n 2 - Depósito \n 3 - Sacar \n 4-Sair");
        switch(ScannerClass.nextDouble()){
            case 1:
                contaDoUsuario.MostraSaldo();
            case 2:
                System.out.println("Digite o valor que deseja deposita:");
                contaDoUsuario.Deposito(ScannerClass.nextDouble());
            case 3:
                System.out.println("Digite o valor que deseja sacar:");
                contaDoUsuario.Saque(ScannerClass.nextDouble());
            case 4:
                isrunning = false;
        }
         
    }
}
