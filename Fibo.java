import java.util.Scanner;

public class Fibo { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int i = 0;
         int j = 1;
         int count= in.nextInt();
         int n =2;
         while(n<=count){
             int temp = j;
             j=i+j;
             i=temp;
              n++;
         }

       System.out.println(j);
        in.close();
    }
    
}
