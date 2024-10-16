package Stack;

 public class usingArray{
    private static int[] stack;
    private static int top;
    private static int capacity;


    public  usingArray(int size){
        stack=new int[size];
        capacity=size;
        top=-1;
    }

    public static void push(int value){
        if(top==capacity-1){
            System.out.println("stack over flow");
            return;
        }
        stack[++top]=value;
    }

    public static int  pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        return stack[top--];
    }
    public static boolean isEmpty(){
        return top==-1;
    }
    public static int peek(){
        if(!isEmpty()){
            return stack[top];
        }
        return -1;
    }
    public static int size(){
        return top+1;
    }

    public static void main(String[] args) {
        usingArray array = new usingArray(5);

        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        pop();
        System.out.println(peek());

    }

}
