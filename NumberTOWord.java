import java.util.*;
class NumberTOWord{
public static void main(String args[]){

int[] arr = {1,2,3,4,5,6,7,8,9,110};
Map<Integer, String> num = new HashMap<>();
num.put(1,"One");
num.put(2,"Two");
num.put(3,"Three");
num.put(4,"Four");
num.put(5,"Five");
num.put(6,"Six");
num.put(7,"Seven");
num.put(8,"Eigth");
num.put(9,"Nine");
num.put(10,"Ten");
for(int nums : arr){

if(num.containsKey(nums)){
System.out.println("Num :"+num.get(nums));
}
else{
System.out.println("Num Not Mapped");
}

}
}

}