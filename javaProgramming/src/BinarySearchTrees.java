public class BinarySearchTrees {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data,Node left,Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }   
    public static Node construct(int[] arr,int lo,int hi){
        if(lo>hi){
            return null;
        }
        int mid = (lo+hi)/2;
        int data = arr[mid];
        Node left = construct(arr, lo, mid-1);
        Node right = construct(arr, mid+1, hi);
        Node root = new Node(data,left,right);
        return root;
    }
    private static void display(Node node){
        while(node==null){
            return;
        }
        String s = " ";
        s+=node.left!=null?node.left.data:"..";
        s+=" <- "+node.data+" -> ";
        s+=node.right!=null?node.right.data:"..";
        System.out.println(s);
        display(node.left);
        display(node.right);
    }
    
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60,70,80};
        Node root = construct(arr,0,arr.length-1);
        display(root);
    }
}
