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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sanduiche sanduiche1 = new Sanduiche_XTudo();
        System.out.println("-------------------------------------------------");
        System.out.println("Sanduiche:   "+ sanduiche1.getDescricao());
        System.out.println("Preco:  " + sanduiche1.preco());
        System.out.println("-------------------------------------------------");
        sanduiche1 = new Adicional_Cebola(sanduiche1);
        System.out.println("Sanduiche:   "+ sanduiche1.getDescricao());
        System.out.println("Preco:  " + sanduiche1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        sanduiche1 = new Adicional_Picles(sanduiche1);
        System.out.println("Sanduiche:   "+ sanduiche1.getDescricao());
        System.out.println("Preco:  " + sanduiche1.preco());
        System.out.println("-------------------------------------------------");
        System.out.println();
        
        Sanduiche veiculo2 = new Sanduiche_XSalada();
        System.out.println("-------------------------------------------------");
        System.out.println("Sanduiche:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
        veiculo2 = new Adicional_Picles(veiculo2);
         System.out.println("-------------------------------------------------");
        System.out.println("Sanduiche:   "+ veiculo2.getDescricao());
        System.out.println("Preco:  " + veiculo2.preco());
        
    
        
    }
    
}
