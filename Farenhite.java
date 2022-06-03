public class Farenhite {
    public static void main(String[] args) {
        int a=0;
        int b=100;
        int step=20;
        while(a<=100){
            // int celcius=(float)((.5555)*(a-32));
            int celcius=((5)*(a-32))/9;

            System.out.println(a+"\t"+celcius);
            // System.out.println(celcius);
            a=a+20;
        }
    }
    
}
