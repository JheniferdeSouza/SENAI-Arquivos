/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Samuelson
 */
public class Produto {
    
    private int id;
    private String nome;
    private String paisDeOrigem;
    private double semente;
    private double adulto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }
    
    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSemente() {
        return semente;
    }

    public void setSemente(double semente) {
        this.semente = semente;
    }

    public double getAdulto() {
        return adulto;
    }

    public void setAdulto(double adulto) {
        this.adulto = adulto;
    } 

    @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
