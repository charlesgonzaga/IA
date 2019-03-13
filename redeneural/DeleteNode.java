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
public class DeleteNode implements IPercorre {
    
    @Override
    public void percorre(Nodo nodo, int del) {
        if (nodo != null) {
            
            if(nodo.getValor() == del) {
                
                if(nodo.getEsquerda() != null && nodo.getDireita()!= null) {
                    
                }
                
                else if(nodo.getEsquerda() != null) {
                    nodo.setValor(nodo.getEsquerda().getValor());
                    Nodo x = nodo.getEsquerda();
                    x = null;
                }
                
                else if( nodo.getDireita()!= null) {
                    nodo.setValor(nodo.getDireita().getValor());
                    Nodo x = nodo.getDireita();
                    x = null;
                } else {
                    nodo = null;
                }
            }
            
        }
    }

}

