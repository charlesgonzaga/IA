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
public class ArvoreBinaria {

    private Nodo raiz;

    public boolean insere(int value) {
        if (raiz == null) {
            System.out.println(value + " eh a raiz da arvore.");
            raiz = new Nodo(value);
            return true;
        } else {
            return raiz.insere(value);
        }
    }

    public void percorre(IPercorre metodo) {
        metodo.percorre(raiz);
    }

}
