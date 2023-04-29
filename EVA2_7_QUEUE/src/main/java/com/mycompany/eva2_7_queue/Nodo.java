package com.mycompany.eva2_7_queue;

public class Nodo {

    private int Valor;
    private Nodo Sig;

    public Nodo() {
        Sig = null;
    }

    public Nodo(int valor) {
        this.Valor = valor;
        this.Sig = null;
    }

    public void setValor(int valor) {
        this.Valor = valor;
    }

    public void setSig(Nodo sig) {
        this.Sig = sig;
    }

    public int getValor() {
        return Valor;
    }

    public Nodo getSig() {
        return Sig;
    }
}
