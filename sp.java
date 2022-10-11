public class sp {
    public static void main(String[] args) {
   int ans=sum2(234,456);
   float ttt =percent2(88,90,69,87,94);
   int sss=sese(20,3,5);
   String amup=trengG("I","love" ,"you.");
        System.out.println("THe sum of 234 and 456 is "+ans);
        System.out.println("THe percentage of students is "+ttt);
        System.out.println("The product of 20 , 3 and 5 is "+sss);
        System.out.println("The string is"+amup);
    }

    private static int sese(int x , int y,int z) {
        int ses = x*y*z;
        return ses;
    }

    static  int sum2(int a, int b){
        int sum =a + b;
        return sum;

    }
    static float percent2(float p ,float  q, float r, float s ,float t){
        float summ = p+q+r+s+t;
        float actual_sum = 6*100;
        float percent = (summ /actual_sum)*100;
        return  percent;
    }
     static String trengG(String a ,String b,String c){
        String us= a + b + c;
        return us;
    }
}
