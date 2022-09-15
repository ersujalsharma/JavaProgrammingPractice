import java.util.ArrayList;
import java.util.List;

public class RecursionIntermediate_LexicographicalNumber {
    public static void main(String[] args) {
        int n = 13;
        List<Integer> list = new ArrayList();
        for(int i=1;i<=9;i++){
            dfs(i,n,list);
        }
        System.out.println(list);
    }
    public static void dfs(int i,int n,List<Integer> list){
        if(i>n){
            return;
        }
        list.add(i);
        for(int j=0;j<=9;i++){
            if(n<10*i+j){
                return;
            }
            dfs(i*10+j,n,list);
        }
    }
}
