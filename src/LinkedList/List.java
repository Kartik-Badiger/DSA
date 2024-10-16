package LinkedList;

public class List {

    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;

        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    public static Node addFirst(int data){
        Node newnode = new Node(data);
//        if(head==null){
//            newnode=head;
//        }
        newnode.next=head;
        head=newnode;
        return head;
    }

    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            System.out.print("->");
            head=head.next;
        }
        System.out.println("null");
    }

//    public static void addLast(int data){
//        Node newnode = new Node(data);
//        if (head == null) {
//            head = newnode;
//        }
//        Node temp = head;
//        while(temp.next!=null){
//            temp= temp.next;
//        }
//        temp.next=newnode;
//    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
//        size++;
    }

    public static void main(String[] args) {
        addLast(5);
        addLast(10);
        addLast(15);
        addLast(20);
        addLast(25);
        addLast(30);
        display(head);
    }
}
