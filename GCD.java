import java.util.*;
public class GCD {
    public static void main(String[] args) {
// public class Main {
    // public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        while (n!=m){
            if (m>n){
                m=m-n;
            }else{
                n=n-m;
            }
        
        }
        System.out.println(m);
        

    }
}
    // }
// }
