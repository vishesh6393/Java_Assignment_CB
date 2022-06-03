import java.util.*;
public class Simple_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n =sc.nextInt();
        int sum=0;

        while(sc.hasNext()){
            // int sum=0

            int n=sc.nextInt();
            sum=sum+n;
            if (sum<0){
                break;
            }else{
                System.out.println(n);
            }
        }
    

        
    }
}
