import java.util.*;
class OccuranceOfElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,1,1,1,1,};
        System.err.println("Elements of an Array: "+Arrays.toString(arr));
        System.err.println("Enter the Elements to be Search : and count the occurance of Element");
        int n =sc.nextInt();
       
        System.out.println(function1(n,arr));

    
    }
    static int function1(int n, int[] arr){
        int count = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
            
        }
return count;
}
}