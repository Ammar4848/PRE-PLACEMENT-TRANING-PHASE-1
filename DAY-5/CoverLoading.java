public class CoverLoading {
    public CoverLoading(int a){
        System.out.println(a);
    }
    public CoverLoading(int x, int y){
        System.out.println(x+" "+y);
    }
    public CoverLoading(int b, int c,int d){
        System.out.println(b+" "+c+" "+d);
    }
    public void show(){

    }
    public static void main(String[] args) {
        CoverLoading co = new CoverLoading(5,6,7);
        co.show();
    }
}