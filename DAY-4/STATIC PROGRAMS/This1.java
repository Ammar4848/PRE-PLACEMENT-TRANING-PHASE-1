public class This1 {
    int a,b;
    public This1(){
        this(10,20);
    }
    public This1(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void show(){
        System.out.println("a="+a+"b="+b);
    }
    public static void main(String[] args) {
        This1 t=new This1();
        This1 t2=new This1(100,200);
        t.show();
        t2.show();
    }
}