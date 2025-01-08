import java.util.Arrays;
import java.util.Scanner;
class twoDArray{
public static void main(String args[]){
Scanner sc =  new Scanner(System.in);
int[][] arr =  new int[3][3];
System.out.println(arr.length);
System.out.println("Above is the given rows and colom");
System.out.println("__________________________________");
System.out.println("Now Input elements of an Array");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
arr[i][j]=sc.nextInt();
}
}
System.out.println("________________OUTPU______");
for(int i=0;i<arr.length;i++){
for(int j=0;j<arr.length;j++){
System.out.print(arr[i][j]+" ");

}
System.out.println();
}

}
}