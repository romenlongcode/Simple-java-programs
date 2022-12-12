//Calculate the average value of array elements
public class P1 {
    public static void main(String[] args) {
        int[] number= new int[]{23,24,52,31,-29,45,-31};
        int sum=0;
        for(int i=0;i<number.length;i++){
            sum =sum+number[i];
        }

        float result=sum/number.length;
        System.out.println("The sum is "+sum);
        System.out.println("The average value of array elements of the given array is found to be " +result);
    }
}
