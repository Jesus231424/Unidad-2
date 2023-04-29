/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_2_9_arbol;

/**
 *
 * @author invitado
 */
public class Nodo {
    private int valor;
    private Nodo Der;
    private Nodo izq;

    public Nodo(){
        Der=null;
        izq=null;
    }
    public Nodo (int valor){
        this.valor=valor;
        this.Der= Der;
        this.izq= izq;
    }
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getDer() {
        return Der;
    }

    public void setDer(Nodo Der) {
        this.Der = Der;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }
}
//a 