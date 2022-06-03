import java.util.*;
public class printseries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();

        int i=1;
        while (i<=n1){

            if ((3*i+2)%n2==0){
                i++;
                n1++;
            }else{
                System.out.println(3*i+2);
                i++;
            }
        }

        
    }
    
}
