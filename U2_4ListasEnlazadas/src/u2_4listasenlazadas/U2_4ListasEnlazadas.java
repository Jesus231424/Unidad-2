
package u2_4listasenlazadas;

import java.util.logging.Level;
import java.util.logging.Logger;


public class U2_4ListasEnlazadas {

    
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        
        for(int i = 0; i < 10; i++){
            lista.agregar((int)(Math.random() * 1000));
        }
        
        System.out.println("Elementos en la lista: " + lista.length());
        lista.imprimir();
        
        lista.imprimirInv();
        
        /*try {
            lista.agregarEn(5000, 0);
        } catch (Exception ex) {
            Logger.getLogger(U2_4ListasEnlazadas.class.getName());
        }*/
    }
    
}
