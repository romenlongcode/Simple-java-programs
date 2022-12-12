public class lnb {
    public static void main(String[] args) {
        int[] maru1={23,45,35,27,51,72,-43,-63,-12};
        int target1 =23;
        boolean result= linearSearch2(maru1,target1);
        System.out.println(result);
    }
    //search the element in the array : if the element is found return index;
    //if the element is not found : return -1;

    static boolean linearSearch2( int[] maru , int target ){
        if(maru.length==0){
            return false;
        }
        for(int element:maru ){
            if (element==target) {
                return true;
            }
        }
        //if all the above return fuction doesn't do , then it means that the target element is not found
        // return false
        return false;
    }

}
