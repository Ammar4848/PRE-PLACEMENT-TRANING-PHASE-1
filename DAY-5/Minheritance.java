public class Minheritance {
    public Minheritance(){
        System.out.println("This is GrandParent Class Constructor");
    }
    public void show(){
        System.out.println("This is GrandParent Class");
    }
}
class abc extends Minheritance{
    public abc(){
        System.out.println("This is Parent Class Constructor");
    }
    public void show(){
        System.out.println("This is Parent Class");
    }
}
class xyz extends abc{
    public static void main(String[] args) {
        abc a = new abc();
        // Minheritance m = new Minheritance();
        a.show();
        // m.show();
    }
}