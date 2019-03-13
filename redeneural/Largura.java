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
public class Largura implements IPercorre {
    
    int aux = 0;
    
    @Override
    public void percorre(Nodo nodo) {
        if (aux == 0) {
            System.out.println(" Valor " + nodo.getValor());
            aux ++;
        }
        
        if (nodo != null) {
            if (nodo.getEsquerda() != null)
                System.out.println(" Valor " + nodo.getEsquerda().getValor());
            
            if (nodo.getDireita() != null)
                System.out.println(" Valor " + nodo.getDireita().getValor());
            
            percorre(nodo.getEsquerda());
            percorre(nodo.getDireita());
        }
    }
    
}
