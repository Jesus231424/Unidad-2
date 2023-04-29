/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._3_nodos;

/**
 *
 * @author xdark
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Nodo nodo = new Nodo();
        nodo.valor = 100;
        nodo.sig = new Nodo();
        nodo.sig.valor = 200;
        nodo.sig.sig = new Nodo();
        nodo.sig.sig.valor = 300;

        Nodo temp = nodo;

        while (temp != null) {
            System.out.println("[" + temp.valor + "]");
            temp = temp.sig;
        }
    }
}

class Nodo {

    public int valor;
    public Nodo sig;

    public Nodo() {
        sig = null;
    }
}
