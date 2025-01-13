import java.util.Arrays;
import java.util.*;
class linerSearch
{
public static void main(String args[])
{
int [] arr = { 1,2,34,5,6,7,9};
int target = 2;
int ans = linear(arr, target);
System.out.println((ans));
System.out.println("Index position is"+ans);
}
static int linear(int[] arr,int target)
{
for(int i=0;i<arr.length;i++)
{
int element =arr[i];
if(target == element)
{
return i;
}
}
return -1;
}



}