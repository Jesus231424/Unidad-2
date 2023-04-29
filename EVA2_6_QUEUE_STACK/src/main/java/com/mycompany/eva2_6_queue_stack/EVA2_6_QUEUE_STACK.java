/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_6_queue_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Flavio
 */
public class EVA2_6_QUEUE_STACK {

    public static void main(String[] args) {
        Queue queue = new LinkedList<Integer>();
        queue.peek(); //Leer pero no borrar
        //FIFO
        queue.add(100);
        queue.add(200);
        queue.add(300);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        //  queue.poll(); //Leer y borrar 
        //queue.remove()
        Stack stack = new Stack<Integer>();
        stack.push(100);
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
