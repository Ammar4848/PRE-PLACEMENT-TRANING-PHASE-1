public class Super1 extends xyz {
    public static void main(String[] args) {
        xyz x = new xyz();
        x.display();
    }
}
class abc{
        int a = 10;
}
class xyz extends abc{
    public void display(){
        int a=20;
        System.out.println("This is Variable From Child class = "+a);
        System.out.println("This is variable from Parent class = "+ super.a);
    }
}