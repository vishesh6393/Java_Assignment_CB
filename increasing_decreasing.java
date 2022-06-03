import java.util.*;
// 7
// 1
// 2
// 3
// 4
// 3
// 2
// 8
// t
public class increasing_decreasing {
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int t=sc.nextInt();
    //     int inc=0;
    //     int dec=0;
    //     int rem=t-1;
    //     int temp=sc.nextInt();
    //     int sec_temp=0;
    //     int error=0;
    //     while (rem!=0){
    //         int n=sc.nextInt();
    //         if(n>temp && n!=temp ){
    //             if (sec_temp<temp){
    //                 inc+=1;
    //             }
    //         }
    //         else if(n<temp && n!=temp){ 
    //             if (sec_temp>=temp){
    //                 dec+=1;
    //             }
    //         }
    //         else{
    //             error++;
    //         }
    //         sec_temp=temp;

    //         temp=n; 
    //         rem--;
    //     }
    //     // if (error==0 || dec==0|| inc==0){
    //     //     System.out.println("t");
    //     // }else{
    //     //     System.out.println("f");
    //     // }
    //         System.out.println("increment  "+inc);
    //         System.out.println("decrement  "+dec);
    //         System.out.println("error  "+error);
    //         System.out.println("temp  "+temp);
    //         System.out.println("sec_temp"+sec_temp);
    // }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int o = sc.nextInt();
        n--;
        boolean increasing = false;
        while(n!=0){
            int x = sc.nextInt();
            if((x<o&&!increasing)||(x>o&&increasing)){
                o=x;
            }else if(x>o&&!increasing){
                increasing=true;
                o=x;
            }else{
                System.out.println("false");
                return;
            }
            n--;
        }
        System.out.println("true");
 
      return;
    }
}
