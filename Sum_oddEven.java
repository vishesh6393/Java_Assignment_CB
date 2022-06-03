import java.util.*;
public class Sum_oddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd_sum=0;
        int even_sum=0;
        while (n!=0){
            int rem=n%10;
            odd_sum=odd_sum+rem;
            n=n/10;
            rem=n%10;
            even_sum=even_sum+rem;
            n=n/10;

            }

            System.out.println(odd_sum)   ;
            System.out.println(even_sum);
        }
        
    
    
    }
    

