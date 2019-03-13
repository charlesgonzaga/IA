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
public class Ordem implements IPercorre {

    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            percorre(nodo.getEsquerda());
            System.out.println(" Valor " + nodo.getValor());
            percorre(nodo.getDireita());
        }
    }
}
