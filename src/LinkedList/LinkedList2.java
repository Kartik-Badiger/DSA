package LinkedList;

public class LinkedList2 {

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

        public static void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public static int getSize(Node head){
            int count =0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }

        public static void insertFirst(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static void insertLast(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        public static void deleteFirst(){
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
        }
        public static void deleteLast(){
            if(head==null){
                System.out.println("list is empty");
            }
            Node temp1=head;
            Node temp2=head.next;

            while(temp2.next!=null){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            temp1.next=null;

        }
        public static void insertAtIndex(int data,int index){
            if(index==0){
                insertFirst(data);
            }
            if (index >= getSize(head)) {
                System.out.println("Index out of bounds");
                return;
            }
            if(index==getSize(head)-1){
                insertLast(data);
            }
            Node temp =head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            Node newnode = new Node(data,temp.next);
            temp.next=newnode;
        }
        public static void deleteAtIndex(int data,int index){
            if(index==0){
                deleteFirst();
            }
            if (index >= getSize(head)) {
                System.out.println("Index out of bounds");
                return;
            }
            if(index==getSize(head)-1){
                deleteLast();
            }
            Node temp =head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        public static void main(String[] args) {

            display();
            insertLast(15);
            insertLast(25);
            insertLast(35);
            insertLast(45);
            insertLast(55);
            insertFirst(50);
            insertFirst(40);
            display();
            insertAtIndex(19,6);
            display();
            deleteAtIndex(41,3);
            display();
        }
    }
}
