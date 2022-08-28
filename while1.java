import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int num=65;
        while(num<n){
            System.out.println(num);
            System.out.println("I am Meitei.");
            num +=7;
        }
    }
}
