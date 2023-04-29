/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._2_cambiar_tama_array;

/**
 *
 * @author xdark
 */
public class App {

    public static void main(String[] args) {
         int[] lista = new int[1];

        // Cada ciclo simula un cliente nuevo y se amuenta el tamaño en 1 del arreglo
        for (int i = 1; i < 1_000_000; i++) {
            int[] copiarLista = copyOf(lista, i);
            copiarLista[i-1] = (int)(Math.random() * 100);
            lista = copiarLista;
        }
    }

    public static int[] copyOf(int[] array, int size) {
        int[] nuevaLista = new int[size];
        int index = 0;

        for (int i = 0; i < nuevaLista.length; i++) {
            if (i < array.length) {
                nuevaLista[i] = array[i];
            }
        }

        return nuevaLista;
    }

}
    
