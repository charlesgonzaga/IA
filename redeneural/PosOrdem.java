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
public class PosOrdem implements IPercorre {

    Nodo esquerda = null;
    Nodo direita = null;
    
    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
            System.out.println(" Valor " + nodo.getValor());
        }
    }

    public void remove(Nodo nodo) {
        //
    }
}
