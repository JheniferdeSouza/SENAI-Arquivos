/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programlive;


/**
 *
 * @author senai
 */
public class ProgramLive {
  
    public static void main(String[] args)
    {
        System.out.println("Começou a contagem");
        contagem();
    }
    public  static void contagem()
    {
        int i = 10;
        do{
            i--;
            System.out.println(i);
            if(i==5)
            {
                System.out.println("Metade do tempo");
            }
        }while(i!=0);
    }
}
