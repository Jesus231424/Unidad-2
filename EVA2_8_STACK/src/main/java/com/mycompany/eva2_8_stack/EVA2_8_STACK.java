/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_8_stack;

import java.util.Stack;

/**
 *
 * @author Flavio
 */
public class EVA2_8_STACK {

    public static void main(String[] args) {
         
        //  queue.poll(); //Leer y borrar 
        //queue.remove()
        Stack stack = new Stack<Integer>();
        
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
            System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
