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
public class EVA_2_9_ARBOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbol= new ArbolBinario();
        arbol.agregarNodo(50);
        arbol.agregarNodo(30);
        arbol.agregarNodo(60);
        arbol.agregarNodo(35);
        arbol.agregarNodo(27);
        arbol.agregarNodo(68);
        arbol.agregarNodo(59);
        arbol.agregarNodo(100);
        arbol.imprimePreOrder();
         System.out.println("");
        arbol.imprimeInOrder();
         System.out.println("");
        arbol.imprimePostOrder();
        //a 
    }
    
}
