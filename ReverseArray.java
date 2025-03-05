
import java.util.Arrays;

class ReverseArray{
    public static void main(String args[]){
        int[] arr ={ 1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = arr.length-1;
         System.err.println("Total Even Elements :  ");
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
        int [] arr1 = arr;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]%2==0){
                System.err.print(arr1[i]+" ");
            }
        }
        System.out.println();
        System.err.println("Total Elements :  "+Arrays.toString(arr1));
    }
}