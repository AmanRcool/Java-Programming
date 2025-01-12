import java.util.*;
class multipleMissing
{
public static void main(String args[])
{
int[] array={1,1,2,2,3,5,7,8,8,10};
//create another array with same length
//by default all index 0
//default value for int variable
int[] register = new int [array[array.length-1]+1];
//iterate over given array to mark all presenet numbers in our integer
for(int i: array)
{
register[i]=1;}
// noew print all absent
System.out.println("All missing numbers");
for(int i=1;i<register.length;i++)
{
if(register[i]==0)
{
System.out.println(i);

}
}
}
}