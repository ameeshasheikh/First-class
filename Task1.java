class Laptop{
    String brand="Hp";
    int price=50000;
    void start(){
        System.out.println("laptop is starting");
    }
}
public class Task1 {
    public static void main(String[] args) {
      Laptop laptop=new Laptop();
      System.out.println(laptop.brand);
      System.out.println(laptop.price);
      laptop.start();
    }
}