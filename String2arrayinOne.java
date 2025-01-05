class String2arrayinOne {
    public static void main(String[] args) {
     String[] arr1={"A","B","C","D","E"};
    String[] arr2={"J","I","H","G","F"};
    String[] sum=  new String[arr1.length+arr2.length];
    int index=0;
    for(int i=0;i<arr1.length;i++){
      sum[index]=arr1[i];
      index++;
    }
     for(int i=0;i<arr2.length;i++){
      sum[index]=arr2[i];
      index++;
    }
    for(String i : sum){
      System.out.print(i+" ");
    }
    }
}