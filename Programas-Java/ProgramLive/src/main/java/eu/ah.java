/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eu;
import java.util.Scanner;
/**
 *
 * @author senai
 */
/** fazer um visual retro como antigamente com botões de ligação, igual o primeiro computador**/
public class ah {
    Scanner ScannerClass = new Scanner(System.in);
    String ConvertBinaryCode;
    
    void MessageDecode()
    {
        switch(ConvertBinaryCode){
            //Letras
            case "01":
                System.out.println("A");
            case "1000":
                System.out.println("B");
            case "1010":
                System.out.println("C");
            case "100":
                System.out.println("D");
            case "0":
                System.out.println("E");
            case "0010":
                System.out.println("F");   
            case "110":
                System.out.println("G");
            case "0000":
                System.out.println("H");
            case "00":
                System.out.println("I");
            case "0111":
                System.out.println("J");
            case "101":
                System.out.println("K");
            case "0100":
                System.out.println("L");
            case "11":
                System.out.println("M");
            case "10":
                System.out.println("N");
            case "111":
                System.out.println("0");
            case "0110":
                System.out.println("P");
            case "1101":
                System.out.println("Q");
            case "010":
                System.out.println("R");
            case "000":
                System.out.println("S");
            case "1":
                System.out.println("T");
            case "001":
                System.out.println("U");
            case "0001":
                System.out.println("V");
            case "011":
                System.out.println("W");
            case "1001":
                System.out.println("X");
            case "1011":
                System.out.println("Y");
            case "1100":
                System.out.println("Z");
           //Numeros
            case "01111":
                System.out.println("1");
            case "00111":
                System.out.println("2");
            case "00011":
                System.out.println("3");
            case "00001":
                System.out.println("4");
            case "00000":
                System.out.println("5");
            case "10000":
                System.out.println("6");
            case "11000":
                System.out.println("7");
            case "11100":
                System.out.println("8");
            case "11110":
                System.out.println("9");
            case "11111":
                System.out.println("0");
            default:
                System.out.println("Valor não existente");
            
            
                
        }
    }
    
}


