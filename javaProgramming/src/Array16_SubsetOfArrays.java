import java.util.Set;

public class Array16_SubsetOfArrays {
    public static void main(String[] args) {
        int[] a= {1,2,3};
        int limit = (int) Math.pow(2,a.length);
        for(int i=0;i<limit;i++){
            String str="";
            int temp=i;
            for (int j = a.length-1; j >= 0; j--) {
                int rem = temp%2;
                temp/=2;
                if(rem==0){
                    str="_"+str;
                }
                else{
                    str = a[j] +"" + str;
                }
            }            
            System.out.println(str);
        }
    }
}

