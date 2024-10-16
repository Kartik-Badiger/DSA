package LinkedList;

import java.security.PublicKey;

public class LinkedList {

    static Node head;
    static class  Node{
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
            Node temp =head;
            while (temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public static int getSize(Node head){
            int count=0;
            while(head!=null){
                count++;
                head=head.next;
            }
            return count;
        }

        public  static void insertAtFirst(int data){
            Node newnode = new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        public static void insertAtLast(int data){
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

        public static void deleteAtFirst(){
            Node dummy =head;
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            head=head.next;
            return;

        }
        public static int deleteAtLast(){
            if(head==null){
                System.out.println("empty list");
            }
            Node temp1=head;
            Node temp2=head.next;
            while(temp2.next!=null){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            temp1.next=null;

            return temp2.data;
        }

        public static void insertAtIndex(int data,int index){
            if(index==0){
                insertAtFirst(data);
                return;
            }
            if(index==getSize(head)-1){
                insertAtLast(data);
                return;
            }
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            Node newnode=new Node(data,temp.next);
            temp.next=newnode;
        }

        public static int deleteAtIndex(int index){
            if(index==0){
                deleteAtFirst();
            }
            if(index==getSize(head)-1){
                deleteAtLast();
            }
            Node temp = head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;

            return temp.next.data;
        }

        public static Node reverse(Node root){
            if(head==null || head.next==null){
                return head;
            }
            Node prev=head;
            Node curr=head.next;
            while (curr!=null){
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head.next=null;
            head=prev;
            return head;
        }

        public static Node detectCycle2(Node LinkedListNode){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){
                    fast=head;
                    while (fast!=slow){
                        fast=fast.next;
                        slow=slow.next;
                    }
                    return fast;
                }
            }
            return null;
        }

        public static boolean detectCycle(Node LinkedListNode){
            Node slow=head;
            Node fast=head;

            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(fast==slow){

                    return true;
                }
            }
            return false;
        }


        public static void main(String[] args) {
            insertAtFirst(10);
            insertAtFirst(20);
            insertAtFirst(30);
            insertAtFirst(40);
            insertAtFirst(50);
            insertAtFirst(60);
            insertAtLast(45);
            insertAtLast(55);
            insertAtIndex(56,4);
            insertAtIndex(56,5);
            insertAtIndex(56,5);

            display();
            reverse(head);
            display();

//            deleteAtIndex(4);
//            display();
        }
    }
}
