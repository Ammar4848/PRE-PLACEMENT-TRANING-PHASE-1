public class Static1 {
    static int a = 10;
    public static void main(String[] args) {
        Static2 obj = new Static2();
        obj.display();
    }
}
class Static2 {
    public void display() {
        System.out.println(Static1.a);
    }
}