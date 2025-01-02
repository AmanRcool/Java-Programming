import java.util.Scanner;
class StringArrayQ1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println( "Ënter the number of Strings");
        int n = sc.nextInt();
        String[] str  = new String[n+1];
        for( i =0;i<str.length;i++){
            str[i]=sc.nextLine();
           
        }
        System.err.println("The Strings are :");
 for( i =0;i<str.length;i++){
          System.err.println(str[i]);  
           
        }
    }
}