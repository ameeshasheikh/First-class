class Student {
    private int ID;
    public int getID(){return ID;}
    public void setID(int id){ID=id;}
}
 class Main{
    public static void main(String[] args) {
        Student s=new Student();
        s.setID(101);
        System.out.println(s.getID());
    }    
    }
