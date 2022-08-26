import java.util.ArrayList;
import java.util.Stack;

public class GenericTree_1 {
    private static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    private static void display(Node node){
        String ans;
        ans = ""+node.data+"-> ";
        for (Node nodes : node.children) {
            ans+=" "+nodes.data;
        }
        ans+=".";
        System.out.println(ans);
        for (Node childNode : node.children) {
            display(childNode);
        }
    }
    public static void main(String[] args) {
        Node root = new Node();
        Stack<Node> st = new Stack();
        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,40,100,-1,-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == -1){
                st.pop();    
            }
            else{
                Node n1 = new Node();
                n1.data = arr[i];
                if(st.size() >0){
                    st.peek().children.add(n1);
                }
                else{
                    root = n1;
                }
                st.push(n1);
            }
        }
        display(root);
    }
}
