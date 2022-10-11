import java.util.Scanner;
public class SSS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("PLease enter the first string :");
        String S1= in.next();
        System.out.print("Please enter the second string:");
        String S2= in.next();
        String S3=S1+S2;
        System.out.println("The new string is "+S3);
       }
}
