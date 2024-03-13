public class pach {
    public static void main(String[] args) {
        for(int i=1 ; i<=5 ; i++){
                if(i==3 || i==8){
                    continue;
                }
                System.out.println(i+" "+ (11-i));
        }
    }
}