import java.util.*;
class SecondLarget{
public static void main(String args[]){
int[] arr = {19,2,3,3,5,5,4,6,7};
for(int i=0;i<arr.length-1;i++){
for(int j=0;j<arr.length-i-1;j++){
if(arr[j]>arr[j+1]){
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}

}

}

System.out.println(Arrays.toString(arr));
System.out.println(arr.length-2);
}
}