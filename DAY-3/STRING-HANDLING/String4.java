public class String4 {
    public static void main(String[] args) {
        int[] a = {100,80,60,70,60,75,85};
        int[] b = new int[a.length];
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if (a[i+1]<a[i]){
                b[i]=1;
                count++;
            }
            else
                b[i]=2;
                count++;
        }

    }
}