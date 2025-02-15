class natural extends Thread{
public void run(){
for(int i=0;i<12;i++){
System.out.print("Natural :"+i);
}
}
}
class odd extends Thread{
public void run(){
for(int i=1;i<12;i=i+1){
System.out.print("Odd :"+i);
}
}
}
class even extends Thread{
public void run(){
for(int i=1;i<12;i=i+1){
System.out.print("Even :"+i);
}
}
}
class thread1{
public static void main(String args[]){
natural n = new natural();
odd o = new odd();
even e = new even();

n.start();
o.start();
e.start();

}

}