public class Bharat {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]) {
                    System.out.println(arr[j]);
                    break;
                } 
            }
        }
        System.out.println("-1");
    }
}