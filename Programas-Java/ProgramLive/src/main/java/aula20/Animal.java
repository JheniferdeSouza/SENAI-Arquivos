/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;

/**
 *
 * @author senai
 * 
 * 
 * 
 */
public class Animal {
    
    int tipoDeAnimal;
    boolean alimentou = true;
    
  
    

    void alimentar(){
        
       System.out.println(tipoDeAnimal);
       if(alimentou == true){
           alimentou = false;
           System.out.println("alimentou o ");
           if(tipoDeAnimal == 1 ){
                System.out.print("Cachorro");}
            else if (tipoDeAnimal == 2)
                {
                    System.out.print("Gato");
                }
       }
       else if (alimentou == false){
           System.out.println("Animal já alimentado.");
       }
   }
   void fala(){
       
       if(tipoDeAnimal == 1){
           System.out.println("Au!");
       }
       else if(tipoDeAnimal == 2){
           System.out.println("Miau!");
       }
   }

}
