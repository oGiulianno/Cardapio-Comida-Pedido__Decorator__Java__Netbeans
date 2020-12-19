/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.decorator;

/**
 *
 * @author Giu
 */
public class Adicional_Picles extends Adicional{
    
    private Sanduiche sanduiche;
    public Adicional_Picles(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Picles";
    }
    public double preco(){
        return 0.50 + sanduiche.preco();
    }
    
}
