import java.util.*;
class EvenDigitInArray{
public static void main(String args[]){
int[] nums={1,2,3,4,5,46,7,8};
System.out.println(findNumber(nums));
}
static int findNumber(int[] nums){
int count=0;
for(int num: nums){
if(even(num)){
count++;
}
}
return count;
}
static Boolean even(int num){
int numberofdigit=digits(num);
return numberofdigit %2==0;
}
static int digits(int num){
int count=0;
while(num>0){
count++;
num=num/10;
}
return count;
}
}