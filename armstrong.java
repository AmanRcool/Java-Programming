class armstrong{
    public static void main(String[] args) {
        int n = 1534;
        int rev =n;
        int sum =0;
        while(n>0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        System.err.println("Sum of cube of digits is :"+sum);
        if(sum==rev){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
}