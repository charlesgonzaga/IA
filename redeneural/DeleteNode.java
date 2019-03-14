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
public class DeleteNode implements IDeleta {
    
    Nodo aux = null;
    Nodo aux2 = null;
    Nodo menor = null;
    
    @Override
    public void percorre(Nodo nodo, int del) {
        
        if(nodo.getValor() == del) {
            if(nodo.getEsquerda() == null && nodo.getDireita() == null)
                nodo = null;
            else if(nodo.getDireita() == null) {
                aux = nodo.getEsquerda();
                this.del(nodo.getEsquerda());
                nodo = aux;
            }
            else if(nodo.getDireita() != null) {
                aux = this.menor(nodo.getDireita());
                nodo.setValor(aux.getValor());
                aux = null;
            }
        }
        else{
            if(nodo.getDireita() != null)
                percorre(nodo.getDireita(), del);

            if(nodo.getEsquerda() != null)
                percorre(nodo.getEsquerda(), del);
        }

    }
    
    public Nodo menor(Nodo n) {
        if (menor == null)
            menor = n;
        else if(n.getValor() < menor.getValor())
            menor = n;
        
        if (n.getEsquerda() != null) {
            aux2 = n;
            menor(n.getEsquerda());
        }
        if (n.getDireita()!= null) {
            aux2 = n;
            menor(n.getDireita());
        }
        
        aux = menor;
        
        if(aux2.getEsquerda() == menor)
            aux2.setEsquerda(null);
        else if(aux2.getDireita()== menor)
            aux2.setDireita(null);
        
        return aux;
    }
    
    public void del(Nodo x) {
        x = null;
    }
}

