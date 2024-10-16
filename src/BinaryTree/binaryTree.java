package BinaryTree;

public class binaryTree {

        static Node root;
        static class Node{
            int value;
            Node left;
            Node right;

            Node(int value){
                this.value=value;
            }
            Node(int value,Node left,Node right){
                this.value=value;
                this.left=left;
                this.right=right;
            }

        }
        private static Node insertRec(Node root,int value){
            if(root==null){
                root=new Node(value);
                return root;
            }
            if(value<root.value){
                root.left=insertRec(root.left,value);
            }
            else if (value>root.value) {
                root.right=insertRec(root.right,value);

            }
            return  root;
        }

        private static void insert(int value){
            root=insertRec(root,value);
        }

        private static void inOrder(Node root){
            if(root!=null){
                inOrder(root.left);
                System.out.print(root.value+" ");
                inOrder(root.right);
            }
        }
        private static void preOrder(Node root){
            if(root!=null){
                System.out.print(root.value+" ");
                inOrder(root.left);
                inOrder(root.right);
            }

        }
        private static void postOrder(Node root){
            if(root!=null){
                inOrder(root.left);
                inOrder(root.right);
                System.out.print(root.value+" ");
            }
        }

        public static boolean Search(Node root ,int key){
            if(root==null){
                return false;
            }
            if(root.value==key){
                return true;
            }
            if(key<root.value){
                return Search(root.left,key);
            }

            return Search(root.right,key);

        }

    public static void main(String[] args) {
        insert(50);
        insert(10);
        insert(30);
        insert(20);
        insert(40);
        insert(70);
        insert(60);
        insert(80);

        System.out.println(Search(root,10));

        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);


    }

}
