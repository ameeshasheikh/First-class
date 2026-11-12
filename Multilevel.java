class GrandParent{
    void name(){
        System.out.println("This is grandparent");
    }
}
class Parent extends GrandParent{
    Parent(){
        System.out.println("This is parent");
    }
}

class Child2 extends Parent{
    Child2(){
        System.out.println("This is child2");
    }
}
class Multilevel{
    public static void main(String[] args) {
        Child2 ch2 = new Child2();
        ch2.name();
       
    }
    }