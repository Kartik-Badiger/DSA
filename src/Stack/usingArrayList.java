package Stack;

import java.util.ArrayList;

public class usingArrayList {

    private static ArrayList<Integer> stack;

    public usingArrayList(){
        stack=new ArrayList<>();
    }

    public static void push(int value){
        stack.add(value);
    }
    public static int pop(){
        if(stack.isEmpty()){
            System.out.println("stack underflow");
        }
        return stack.remove(stack.size()-1);
    }

    public static int peek(){
        if(!stack.isEmpty()){
            return stack.get(stack.size()-1);
        }
        return -1;
    }
    public static int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        usingArrayList list = new usingArrayList();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        pop();
        System.out.println(peek());
    }
}
