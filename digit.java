class digit{
    public static void main(String[] args) {
        int n = 21344;
        int count=0;
        System.out.println("Reverse of Number");
        while(n >0){
           int rem=n%10;
            count++;
            n=n/10;
             System.err.println(rem);
        }
       System.out.println("count of digits is :"+count);
    }
}                                          