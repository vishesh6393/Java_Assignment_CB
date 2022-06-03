import java.util.*;
public class Shopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        // int ayush_sum=0;
        
        while(t!=0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int ayush_sum=0;
            int harshit_sum=0;
           int x =1;
           int y =2;
           while(ayush_sum+x<m){
               ayush_sum+=x;
               x+=2;
           }
           while(harshit_sum+y<n){
               harshit_sum+=y;
               y+=2;
           }

            
            System.out.println("Ayush Sum"+" "+ayush_sum);
            System.out.println("Harshit Sum"+" "+harshit_sum);
            if (ayush_sum>harshit_sum){
                System.out.println("Ayush");
            }else{
                System.out.println("Harshit");
            }
            t--;
        }
    }
}
