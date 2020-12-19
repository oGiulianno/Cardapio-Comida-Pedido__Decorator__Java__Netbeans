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
public class Adicional_Cebola extends Adicional{
    
    private Sanduiche sanduiche;
    public Adicional_Cebola(Sanduiche sanduiche){
        this.sanduiche = sanduiche;
    }
    public String getDescricao(){
        return sanduiche.getDescricao() + ", Cebola";
    }
    public double preco(){
        return 0.50 + sanduiche.preco();
    }
    
}
