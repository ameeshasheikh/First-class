class car{
    String color;
    void speed(int num){
        System.out.println("Speed..."+num);
    }
}
 public class Task4{
    public static void main(String[]args){ 
        car Tesla=new car();
        car Ferrai=new car();
        Tesla.color="black";
        Ferrai.color="white";
        System.out.println(Tesla.color);
        System.out.println(Ferrai.color);
        Tesla.speed(200);
        Ferrai.speed(300);
    }

    }

