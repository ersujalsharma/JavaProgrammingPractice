import java.util.Stack;

/**
 * BinaryTrees_Example_2
 * size();
 * sum();
 * max();
 * height();
 */
public class BinaryTrees_Example_2 {


    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
        }
    }
    public static class Pair{
        Node node;
        int state;
        Pair(Node node,int state){
            this.node = node;
            this.state  = state;
        }
    }
    private static Node construct(Integer[] arr){
        Node root = new Node(arr[0]);
        Stack<Pair> stack = new Stack<>();
        Pair rootPair = new Pair(root,1);
        stack.push(rootPair);
        int idx = 1;
        while(stack.size()>0){
            Pair top = stack.peek();
            if(top.state == 1){
                top.state++;
                if(arr[idx] !=null){
                    Node lc = new Node (arr[idx]);
                    top.node.left = lc;
                    Pair lcp = new Pair(lc,1);
                    stack.push(lcp);
                }
                idx++;
            }
            else if(top.state == 2){
                top.state++;
                if (arr[idx] != null) {
                Node rc = new Node(arr[idx]);
                top.node.right = rc;

                Pair rcp = new Pair(rc, 1);
                stack.push(rcp);
                }
                idx++;
            }
            else if(top.state == 3){
                stack.pop();
            }
        }
        return root;
    }
    private static void display(Node root) {
        if(root == null){
            return;
        }
        String ans = "";
        ans+= root.left==null ? "..":root.left.data;
        ans+= " <- "+root.data+" -> ";
        ans+= root.right== null ? "..":root.right.data;
        System.out.println(ans);
        display(root.left);
        display(root.right);
    }
    private static void traversalInOrder(BinaryTrees_Example_2.Node root) {
        if(root == null ){
            return;
        }
        traversalInOrder(root.left);
        System.out.print(root.data+" ");
        traversalInOrder(root.right);
    }
    private static void traversalPostOrder(BinaryTrees_Example_2.Node root) {
        if(root == null ){
            return;
        }
        traversalPostOrder(root.left);
        traversalPostOrder(root.right);
        System.out.print(root.data+" ");
    }
    private static void traversalPreOrder(BinaryTrees_Example_2.Node root) {
        if(root == null ){
            return;
        }
        System.out.print(root.data+" ");
        traversalPreOrder(root.left);
        traversalPreOrder(root.right);
    }
    
    public static void main(String[] args) {
        Integer []arr = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = construct(arr);
        display(root);
       
        traversalPreOrder(root);
        System.out.println();
        traversalPostOrder(root);
        System.out.println();
        traversalInOrder(root);
    }
}