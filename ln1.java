public class ln1 {
    public static void main(String[] args) {
        int[] maru1={23,45,35,27,51,72,-43,-63,-12};
        int target1 =-112;
        int result= linearSearch1(maru1,target1);
        System.out.println(result);
    }
    //search the element in the array : if the element is found return index;
    //if the element is not found : return -1;

    static  int linearSearch1( int[] maru , int target ){
        if(maru.length==0){
            return Integer.MAX_VALUE;
        }
        for(int element:maru ){
            if (element==target) {
                return element;
            }
        }
        //if all the above return fuction doesn't do , then it means that the target element is not found
        // return-1
        return Integer.MAX_VALUE;
    }

}

