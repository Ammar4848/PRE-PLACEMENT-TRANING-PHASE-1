import java.util.*;
public class Array {
    public static void main(String[] args) {
       int arr1[]={4,3,2,1,0};
       int arr2[]={1,3,2,4,0};
       Arrays.sort(arr1);
       Arrays.sort(arr2);
    //    System.out.println(Arrays.toString(arr1));
    //    System.out.println(Arrays.toString(arr2));
       System.out.println(Arrays.equals(arr1,arr2));
    }
}