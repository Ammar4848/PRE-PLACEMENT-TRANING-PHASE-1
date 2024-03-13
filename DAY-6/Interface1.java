interface ABC{
    public void show();
}
class PQR{
    static int a=10;
}
public class Interface1 extends PQR implements ABC {
    public void show(){
        System.out.println("This is chid Class"+a);
    }
    public static void main(String[] args) {
        ABC b = new Interface1();
        b.show();
    }
}