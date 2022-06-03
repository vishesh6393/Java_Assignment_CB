import java.util.*;
import java.math.MathContext;
public class numberrotation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int ndigit=0;
        int rot=2;
        while(n>0){
            n=n/10;
            ndigit++;
        }
        rot=rot%ndigit;
        System.out.println(ndigit);
        for(int r=0;r<rot;r++){
            int last=num%10;
            int remain=num/10;
            int pow=(int)Math.pow(10, ndigit-1);
            int ans=last*pow+remain;
            System.out.println(ans);
            num=ans;
        
        }
        
    }
}
