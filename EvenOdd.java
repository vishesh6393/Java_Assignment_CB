import java.util.*;
public class EvenOdd {
 public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     int t=sc.nextInt();
     while (t!=0){
        int n=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        while (n!=0){
            int rem=n%10;
            if (rem%2!=0){
                even_sum+=rem;
            }else{
                odd_sum+=rem;
            }
            n=n/10;
        }
        if (even_sum%3==0 || odd_sum%4==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
         t--;
     }
 }   
}
