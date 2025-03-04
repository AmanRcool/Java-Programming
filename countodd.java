class countodd{
    public static void main(String[] args){
        int[] arr ={2,4,5,6,7,8,9,91};
        int count = 0;
        System.err.println(" Odd Elements");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
               System.out.print(arr[i]+" ");
            }
             
        }
        System.err.println();
        System.err.print(" count OF Odd Elements : ");
        System.out.println(count);
    }
}