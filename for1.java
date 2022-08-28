import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
       /*
       for(int x=0; x<7;x+=2){

           System.out.println(x);
       }
       */
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        for (int num =5;num < n; num+=5 ){
            System.out.println(num + "");
            System.out.println("Hello World!");
        }
    }
}
