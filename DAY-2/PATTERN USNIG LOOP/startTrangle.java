public class startTrangle {
    public static void main(String[] args) {
        int sp=12;
        for(int i=1;i<=4;++i){
            for(char k=1; k<=sp;++k){
                System.out.print(" ");
            }
                for(int j=1;j<=i;++j){
                    System.out.print("* ");
                }
                System.out.println();
                --sp;
            }
    }
}