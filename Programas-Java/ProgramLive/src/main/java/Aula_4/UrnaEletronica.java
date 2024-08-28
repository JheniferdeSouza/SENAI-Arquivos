/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_4;

import java.util.Scanner;

/**
 *
 * @author senai
 */
public class UrnaEletronica {

    /**
     * @param args the command line arguments
     */
    /*Instruções
    1.Tem três possiveis candidatos
    2.Cada candidato tem um numéro
    3.O programa apresenta uma entrada de dados para digitar o numero do candidato.
    4.Ao digitar um voto, sera contabilizado.
    5.Ao digitar uma senha do mesario o programa ira encerrar a votação.
    6.No final mostrara o voto total
    7.só esta disponivel o modo mesario fechar urna as 17:00 e abrir as 13:00.
    */
    
    
    static int modeUser = 0;
    static Scanner ScannerClass = new Scanner(System.in);
    static int quantyCandidate1,quantyCandidate2,quantyCandidate3,quantyTotalVotes;
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        

        System.out.println("|___Bem vindo a Urna___");
        System.out.println("Para fazer uma votação é necessario se identifica");
        Logon();
        
         
    }
    
    static void Menu(){
        int option;
        System.out.println("o que deseja fazer?");
        if(modeUser==1)
        {
            System.out.println("1 - votar /n 2 - entrar no modo mesário");
            option = ScannerClass.nextInt();
            if(option == 1)
            {
                User();
            }
            else if(option == 2)
            {
                Logon();
            }
            
          
        }
        else if(modeUser==0){
            System.out.println("1 - fechar urna /n 2 - entrar no modo usuario");
            option = ScannerClass.nextInt();
            if(option == 1)
            {
                Adm();
            }
            else if(option == 2)
            {
                Logon();
            }
        }
        
    }
    
    static void Logon()
    {
        String option;
        final String PasswordAdm = "00000";
        
        //sistema de login de Usuario
        System.out.println("Você deseja entrar como mesário?");
        System.out.print("S-sim ou N-não");
        option =ScannerClass.next().toUpperCase();
        if(option.equals("S"))
        {
            System.out.println("Digite a senha de mesário");
            if(ScannerClass.next().equals(PasswordAdm))
            {
                System.out.println("Entrado com sucessor");
                modeUser=0;
                Adm();
                
                
            }
            else
            {
                System.out.println("Senha incorreta, entrando como usuario normal...");
                modeUser=1;
                User();
            }
        }
        else if(option.equals("N"))
        {
            System.out.println("entrou como usuario normal");
            modeUser=1;
            User();
        }
    }
    
    static void Adm(){
        //controle da abertura dos votos
        System.out.println("Você deseja fechar a urna?");
        switch(ScannerClass.nextInt()){
            case 0:
                System.out.print("Fechando...");
                quantyTotalVotes = quantyCandidate1+quantyCandidate2+quantyCandidate3;
                System.out.println("/Encerramento das eleções| \n Candidato 1:"+quantyCandidate1+"\n Candidato 2:"+quantyCandidate2+"\n Candidato 3:"+quantyCandidate3+"\n total de votos:"+quantyTotalVotes);
                if(quantyCandidate3>quantyCandidate1 && quantyCandidate3>quantyCandidate2){
                    System.out.println("Ganhador da eleição é Pedro");
                   
                }
                else if(quantyCandidate2>quantyCandidate1 && quantyCandidate2>quantyCandidate3){
                    System.out.println("Ganhador da eleição é Ana");
                }
                else if(quantyCandidate1>quantyCandidate3 && quantyCandidate1>quantyCandidate2){
                    System.out.println("Ganhador da eleição é Maria");
                    
                }
                else{
                    System.out.println("Erro empate!!!");
                }
                break;
            case 1:
                System.out.print("Saindo do modo mesario....");
                Menu();
                          
        }
        
    }
    static void User()
    {
        String confirme;
        //Controle de votação
        System.out.println("Você deseja votar? \n 0 - sim e 1 - não");
        switch(ScannerClass.nextInt())
        {
           case 0:
                System.out.println("Escreva o numero do seu candidato que deseja votar");
                System.out.println("\n 77123 - Pedro \n 90321 - Maria \n 12345 - João");
                switch(ScannerClass.nextInt())
                {
                    case 77123:
                        /*
                        System.out.println("Candidato detectado! tem certeza que deseja vota em Pedro? ");
                        confirme = ScannerClass.next().toUpperCase();
                        if(confirme.equals("S"))
                        {*/
                           System.out.println("Voto computado com sucessor! em Pedro "); 
                           quantyCandidate1++;
                           System.out.println(quantyCandidate1);
                           break;
                        /*   
                        }*/
                    case 90321:
                        /*
                        System.out.println("Candidato detectado! tem certeza que deseja vota em Maria? ");
                        confirme = ScannerClass.next().toUpperCase();
                        if(confirme.equals("S"))
                        {*/
                           System.out.println("Voto computado com sucessor! em Maria "); 
                           quantyCandidate2++;
                           break;
                           
                        //}
                    case 12345:
                       /* System.out.println("Candidato detectado! tem certeza que deseja vota em Pedro? ");
                        confirme = ScannerClass.next().toUpperCase();
                        if(confirme.equals("S"))
                        {*/
                           System.out.println("Voto computado com sucessor! em Pedro "); 
                           quantyCandidate3++;
                           break;
                           
                        //}
                 
                }
                Menu();
           case 1:
               Menu();
                
        }
    }
    {
        
        
    }
}
