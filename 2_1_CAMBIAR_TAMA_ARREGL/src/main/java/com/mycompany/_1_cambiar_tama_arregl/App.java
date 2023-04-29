/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._1_cambiar_tama_arregl;

/**
 *
 * @author xdark
 */
public class App {

    public static void main(String[] args) {
         int[] list = new int[3];
        list[0] = 100;
        list[1] = 200;
        list[2] = 300;

        // / Expandir el arreglo a tamaño 10 sin perder datos
        // Con el metodo copyOf de la clase Arrays
//        int[] arrCopy = Arrays.copyOf(arr, 10);
//
//        for(int el : arrCopy) {
//            System.out.println("[" + el + "]");
//        }

        // Sin ninguna utileria
        int[] arrCopy = copiar(list, 10);

        for (int el : arrCopy) {
            System.out.println("[" + el + "]");
        }
    }

    public static int[] copiar(int[] array, int size) {
        int[] newList = new int[size];
        int index = 0;

        for (int i = 0; i < newList.length; i++) {
            if (i < array.length) {
                newList[i] = array[i];
            }
        }

        return newList;
    }
}
    

