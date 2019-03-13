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
public class PreOrdem implements IPercorre {

    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            System.out.println(" Valor " + nodo.getValor());
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
        }
    }
}
