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
public class Nodo {

    private int valor;
    private Nodo esquerda, direita;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setEsquerda(Nodo esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(Nodo direita) {
        this.direita = direita;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getEsquerda() {
        return this.esquerda;
    }

    public Nodo getDireita() {
        return this.direita;
    }

    public Nodo(int value) {
        this.valor = value;
    }

    public boolean insere(int value) {
        if (value == this.valor) {
            esquerda = new Nodo(value);
            System.out.println("Valor ja existe na arvore");
            return false;
        } else if (value < this.valor) {
            if (esquerda == null) {
                esquerda = new Nodo(value);
                System.out.println("Inserindo " + value + " a esquerda de " + this.valor);
                return true;
            } else {
                return esquerda.insere(value);
            }
        } else if (value > this.valor) {
            if (direita == null) {
                direita = new Nodo(value);
                System.out.println("Inserido " + value + " a direita de " + this.valor);
            } else {
                return direita.insere(value);
            }
        }
        return false;
    }
}
