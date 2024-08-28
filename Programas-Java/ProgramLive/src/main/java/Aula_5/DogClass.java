/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula_5;

/**
 *
 * @author senai
 */
public class DogClass {

    String name;
    String breed;
    String color;
    int age;
    
    public DogClass(String nameDog, String breedDog, String colorDog, int ageDog ){
        
        name = nameDog;
        breed = breedDog;
        color = colorDog;
        age = ageDog;
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        DogClass Dog1 = new DogClass("Alan","Husky siberiano","Preto", 10);
        System.out.println(Dog1.name);
        System.out.println(Dog1.age);
    }
    
}
