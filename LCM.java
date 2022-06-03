import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int temp_n=n;
        int temp_m=m;
        // int m=sc.nextInt();
        
        while (n!=m){
            if (m>n){
                m=m-n;
            }else{
                n=n-m;
            }
        
        }
        // System.out.println(m);
        int lcm=(temp_n*temp_m)/m;
        System.out.println(lcm);
    }
        
    }
    
// }
