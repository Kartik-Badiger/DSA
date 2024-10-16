package Stack;

import java.util.*;

public class usingLinkedList {

    private static LinkedList<Integer> stack;

    public usingLinkedList(){
        stack=new LinkedList<>();
    }
    public static void push(int value){
        stack.addFirst(value);
    }
    public static int pop(){
        if(stack.isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        return stack.removeFirst();
    }
    public static int peek(){
        if(!stack.isEmpty()){
            return stack.getFirst();
        }
        return -1;
    }

    public static void main(String[] args) {
        usingLinkedList stack = new usingLinkedList();

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        pop();
        pop();
        pop();
        System.out.println(peek());
    }
}
