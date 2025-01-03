class maxVal{
public static void main(String args[]){
int[] arr ={1,4,24,54,23,55};
System.out.println(max(arr));
}
// imagine that arr is not empty.
static int max(int[] arr){
int maxVal=arr[0];
for(int i=1;i<arr.length;i++){
if(arr[i]>maxVal){
maxVal=arr[i];
}
}

return maxVal;
}
}