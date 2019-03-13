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
    /*
    Nodo e, d;
    
    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            System.out.println(" Valor " + nodo.getValor());
            
            if(nodo.getEsquerda() != null) {
                e = nodo.getEsquerda();
                System.out.println(" Valor " + e.getValor());
            }
            
            if(nodo.getDireita() != null) {
                d = nodo.getDireita();
                System.out.println(" Valor " + d.getValor());
            }
            
            if (e.getEsquerda() != null)
                percorre(e.getEsquerda());
            if (e.getDireita() != null)
                percorre(e.getDireita());
            
            if (d.getEsquerda() != null)
                percorre(d.getEsquerda());
            if (d.getDireita() != null)
                percorre(d.getDireita());
        }
    }
    */
    
    /*
    Nodo aux;
    
    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            System.out.println(" Valor " + nodo.getValor());
            
            if(nodo.getEsquerda() != null) {
                aux = nodo.getEsquerda();
                System.out.println(" Valor " + aux.getValor());
                
                if(aux.getEsquerda() != null)
                    percorre(aux.getEsquerda());
                if(aux.getDireita() != null)
                    percorre(aux.getDireita());
            }
            
            if(nodo.getDireita() != null) {
                aux = nodo.getDireita();
                System.out.println(" Valor " + aux.getValor());
                
                if(aux.getEsquerda() != null)
                    percorre(aux.getEsquerda());
                if(aux.getDireita() != null)
                    percorre(aux.getDireita());
            }
        }
    }
    */
    
    
    
    Nodo e, d;
    
    @Override
    public void percorre(Nodo nodo) {
        if (nodo != null) {
            System.out.println(" Valor " + nodo.getValor());
            
            if(nodo.getEsquerda() != null) {
                e = nodo.getEsquerda();
                System.out.println(" Valor " + e.getValor());
            } else 
                e = null;
            
            if(nodo.getDireita() != null) {
                d = nodo.getDireita();
                System.out.println(" Valor " + d.getValor());
            } else
                d = null;
            
            if (e != null) {
                //percorre(e.getDireita());
                if(e.getEsquerda() != null)
                    System.out.println(" Valor " + e.getEsquerda().getValor());
                if(e.getDireita() != null)
                    System.out.println(" Valor " + e.getDireita().getValor());
            }
            if (d != null) {
                //percorre(d.getDireita());
                if(d.getEsquerda() != null)
                    System.out.println(" Valor " + d.getEsquerda().getValor());
                if(d.getDireita() != null)
                    System.out.println(" Valor " + d.getDireita().getValor());
            }
            
            percorre(d.getDireita().getEsquerda());
        }
    }
    
}
