class sum2array{
    public static void main(String[] args) {
        
        int[] arr1 ={1,2,3,4,5};
        int[] arr2 = {23,23,24,25};
        int[] sum = new int[arr1.length+arr2.length];
     int index =0;
for(int i=0;i<arr1.length;i++){
  sum[index]=arr1[i];
  index++;
}for(int i=0;i<arr2.length;i++){
  sum[index]=arr2[i];
  index++;
}
for(int i : sum){
  System.out.print( i+" ");
}

    }
}