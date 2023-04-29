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
public class ArbolBinario {

    private Nodo root;

    public ArbolBinario() {
        root = null; //Arbol esta vacio. 
    }

    public void agregarNodo(int valor) {
        Nodo nuevo = new Nodo(valor); // Creamos un nuevo nodo. 
        //VERIFICAMOS SI EL ARBOL ESTÁ VACÍO
        if (root == null) {//árbol esta vacio? 
            root = nuevo;
        } else { //NO ESTA VACÍO
            //necesitamos recursión
            agregarNodoR(root, nuevo);
        }
    }

    private void agregarNodoR(Nodo actual, Nodo nuevo) {
        //VERIFICAR LA POSICIÓN DEL VALOR (IZQ,DER,O EXISTENTE)
        if (nuevo.getValor() < actual.getValor()) { //Nuevo va a la izquierda
            //Verificar si hay espacio
            if (actual.getIzq() == null) {//El nodo va aqui
                actual.setIzq(nuevo);// insertamos
            } else {//No esta vacio
                agregarNodoR(actual.getIzq(), nuevo);//hay que movernos desde la raiz
            }
        } else if (nuevo.getValor() > actual.getValor()) {//nuevo va a la derecha
            //Verificar si hay espacio
            if (actual.getDer() == null) {//El nodo va aqui
                actual.setDer(nuevo);// insertamos
            } else {//No esta vacio
                agregarNodoR(actual.getDer(), nuevo);//hay que movernos desde la raiz
            }
        } else {// valor repetido
            System.out.println("El valor " + "[" + nuevo.getValor() + "]" + " ya existe dentro del arbol, esta repetido");
        }
    }

    //Mostrar los datos:
    //Pre-Order
    public void imprimePreOrder() {
        preOrder(root);
    }

    public void preOrder(Nodo actual) {
        if (actual != null) {
            System.out.print("[" + actual.getValor() + "]");
            preOrder(actual.getIzq());
            preOrder(actual.getDer());
        }

    }

    public void imprimeInOrder() {
        inOrder(root);
    }

    public void inOrder(Nodo actual) {
       
        if (actual != null) {
            inOrder(actual.getIzq());
            System.out.print("[" + actual.getValor() + "]");
            inOrder(actual.getDer());
        }

    }

    public void imprimePostOrder() {
        postOrder(root);
    }

    public void postOrder(Nodo actual) {
        
        if (actual != null) {
            postOrder(actual.getIzq());
            postOrder(actual.getDer());
            System.out.print("[" + actual.getValor() + "]");

        }

    }
    public void borrarElementoArbol(Nodo valor){
        borrarElementoArbol(root);        
    }
        
    }

//a