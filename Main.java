import java.util.Scanner;
class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter three numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && a>c){
      System.out.println("a is big");
    }
   if(a<b && a<c){
    System.out.println("ais small");
 }
  if(b>a && b>c){
    System.out.println("b is big");
 }
  if(b<a && b<c){
    System.out.println("bis small");
 }
  if(c>a && c>b){
    System.out.println("c is big");
  }
  if(c<a && c<b){
    System.out.println("c is small");
  }
  sc.close();
    }
}   

    


