
public class Countnum {
    public static void main(String[] args) {
    int n=356682683;
    int count =0;
     while(n>0){
         int rem= n%10;
         if(rem==7){
             count++;
         }
          n = n/10;
     }  
     System.out.println(count);  
    }
    
}
