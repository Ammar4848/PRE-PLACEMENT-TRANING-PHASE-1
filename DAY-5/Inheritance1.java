public class Inheritance1 {
    public void show() {
        System.out.println("This is show method");
    }
    public void display() {
        System.out.println("This is display method");
    }
}
class abc extends Inheritance1{
    public static void main(String[] args) {
        abc a=new abc();
        a.show();
        a.display();
    }
}