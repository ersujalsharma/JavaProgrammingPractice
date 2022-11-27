package Strivers_DSA_Sheet.Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BinaryTrees {
    Node rootOfTree;
    public static void main(String[] args) {
        BinaryTrees bt = new BinaryTrees();
        Node root = new Node(25);
        bt.rootOfTree = root;
        Node newNode  = new Node(30);
        root.left = newNode;
        newNode = new Node(40);
        root.right = newNode;
        newNode  = new Node(50);
        root.left.left = newNode;
        newNode = new Node(60);
        root.left.right = newNode;
        newNode = new Node(70);
        root.right.left = newNode;
        newNode = new Node(80);
        root.right.right = newNode;
        // System.out.println(bt.rootOfTree.left.data);
        System.out.println("-------PREORDER-------");
        preOrder(root);
        System.out.println("-------INORDER-------");
        inOrder(root);
        System.out.println("-------POSTORDER-------");
        postOrder(root);
        System.out.println("--------LEVEL ORDER------");
        levelOrder(root);
        System.out.println("--------PRE ORDER------");
        preOrderIterativeTraversal(root);
    }
    private static void preOrderIterativeTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            System.out.println(root.data);
            if(root.right!=null) stack.push(root.right);
            if(root.left!=null) stack.push(root.left);
        }
    }
    private static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            System.out.println(queue.peek().data);
            if(queue.peek().left!=null)
                queue.offer(queue.peek().left);
            if(queue.peek().right!=null)
                queue.offer(queue.peek().right);
            queue.poll();
        }
    }
    private static void inOrder(Node root) {
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    private static void preOrder(Node root) {
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void postOrder(Node root) {
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right
        );
        System.out.println(root.data);
    }
}
class Node{
    Node left;
    int data;
    Node right;
    public Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
