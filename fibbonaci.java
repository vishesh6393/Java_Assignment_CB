import java.util.*;
public class fibbonaci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        int b =1;
        int i=0;
        while(i<n){
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.println(a);
    }
}
