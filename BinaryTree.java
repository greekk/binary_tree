package tree;

import java.util.Objects;

public class BinaryTree {

    private Node root;

    public Node current;

    public class Node{
        private int key;
        private long data;
        private Node left;
        private Node right;
        private void display(){
            System.out.println(this.key + " : " + this.data);
        }

        public Node(int key, long data){
            this.key = key;
            this.data = data;
        }
        public Node(){
            this.left = null;
            this.right = null;
        }

        public long getData(){
            return this.data;
        }
    }

    public Node find(int key){
        Node current = this.root;
        while(current.key != key){
            if(key < current.key)
                current = current.left;
            else
                current = current.right;
            if(Objects.isNull(current))
                return null;
        }
        this.current = current;
        return this.current;
    }

    public void insert(int key, long data){
        Node newNode = new Node(key,data);
        if(Objects.isNull(this.root)){
            this.root = newNode;
            return;
        }
        Node cursor = this.root;
        Node current;//variable for moving upon tree
        while(true){
            current = cursor;//variable for current node
            if (key < cursor.key){
                cursor = cursor.left;
                if(Objects.isNull(cursor)){
                    current.left = newNode;
                    return;
                }
            }
            else{
                cursor = cursor.right;
                if(Objects.isNull(cursor)){
                    current.right = newNode;
                    return;
                }
            }
        }
    }

    public void delete(){

    }

}
