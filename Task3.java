class Smartphone{
    String company="poco";
    String os="Android";
    int Storage=127;
    void takephoto() {
    System.out.println("click photo");
   }
}
public class Task3 {
public static void main(String[] args) {
    Smartphone phone=new Smartphone();
    System.out.println(phone.company);
    System.out.println(phone.os);
    System.out.println(phone.Storage);
    phone.takephoto();
    }
}


 