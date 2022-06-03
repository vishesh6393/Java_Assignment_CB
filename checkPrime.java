import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        
        int si=2;
        int ei=n;
        while (si<=ei){
            int num=si;
            int factor=0;
            int pf=1;
            while (pf<=num){
                if (num%pf==0){
                    factor=factor+1;
                }
                pf++;

            // System.out.println(factor);
            }
            if (factor==2){
                System.out.println(si);
            }
            
            si++;
            
        }
        
    }
}
