/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redeneural;

/**
 *
 * @author charles
 */
public class RedeNeural {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArvoreBinaria ab = new ArvoreBinaria();
        ab.insere(5);
        ab.insere(3);
        ab.insere(4);
        ab.insere(7);
        ab.insere(6);
        ab.insere(17);
        ab.insere(12);
        //ab.insere(25);

        System.out.println("=========Em Ordem=========================");
        ab.percorre(new Ordem());

        System.out.println("=========Pre Ordem (profundidade)=========================");
        ab.percorre(new PreOrdem());
        
        
        
        System.out.println("=========Pos Ordem=========================");
        ab.percorre(new PosOrdem());

        System.out.println("=========Delete=========================");
        ab.percorre(new DeleteNode(), 3);
        
        System.out.println("=========Largura=========================");
        ab.percorre(new Largura());
    }

}
