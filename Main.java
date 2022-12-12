//find whether a number exist in the array
public class Main {

    public static void main(String[] args) {
        int[] maru1={23,45,35,27,51,72,-43,-63,-12};
        int target1 =-12;
        int result= linearSearch(maru1,target1);
        System.out.println(result);
    }
    //search the element in the array : if the element is found return index;
    //if the element is not found : return -1;

    static  int linearSearch( int[] maru , int target ){
     if(maru.length==0){
         return -1;
     }
     for(int index =0; index<maru.length;index++){
         int element = maru[index];
         if (element==target) {
             return index;
         }
     }
     //if all the above return fuction doesn't do , then it means that the target element is not found
     // return-1
     return -1;
    }

}