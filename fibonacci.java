class fibonacci{
    public static void main(String[] args) {
        // int n1=0,n2=1;
        // for(int i=0;i<=4;i++){
        //     System.err.println(n1+n2);
        //     int n3 = n2+n1;
        //     n1=n2;
        //     n2=n3;

        // }
        int N=10;
        for(int i=0;i<10;i++){
            System.err.print(fib(i)+" ");
        }
    }
    static int fib(int n){
        if(n<=1)
        return n ;
        return fib(n-1)+fib(n-2);
    }
}