public class Super2 extends xyz{
    public void show(){
        System.out.println("This is Show Method of Child class");
    }
    public void display(){
        System.out.println("This is Display Method of Child class");
        super.display();
    }
    public static void main(String[] args) {
        Super2 s = new Super2();
        s.show();
        s.display();
    }
}
class xyz{
    public void display(){
        System.out.println("This is Parent class");
    }
}