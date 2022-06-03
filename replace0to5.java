import java.util.*;
public class replace0to5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long ans=0;
        long p=1;
        if (n==0){
            System.out.println(5);
        }
        else{
            while (n!=0){
                long rem=n%10;
                if (rem==0){
                    ans=ans+5*p;
                }else{
                    ans=ans+rem*p;
                }
                n=n/10;
                p=p*10;
            }
            System.out.println(ans);
        }

    }
}
