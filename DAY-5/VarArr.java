public class VarArr {
    void m1(char c, String... a){
        System.out.print(c+" ");
        for (String i : a) {
            System.out.print(i+ " ");
        }
    }
    public static void main(String[] args) {
        VarArr v = new VarArr();
        v.m1('c');
        v.m1('a',"Ammar","Nagarji");
    }
}