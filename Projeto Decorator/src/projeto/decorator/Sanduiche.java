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
public abstract class Sanduiche {
    
    String descricao = "Sanduiche";

	public String getDescricao() {
		return descricao;
	}
        
	public abstract double preco();
    
}
