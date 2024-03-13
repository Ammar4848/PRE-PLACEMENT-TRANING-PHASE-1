import java.util.*;
public class FirstBadVersion {
    public boolean isBadVersion(int version, int bad) {
        if (version >= bad)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sf = new Scanner(System.in);
        FirstBadVersion fbv = new FirstBadVersion();
        System.out.println("Enter the Number of Versions");
        int n = sf.nextInt();
        System.out.println("Enter the Bad Version");
        int bad = sf.nextInt();
        sf.close();
        int arr[] = new int[n];
        for (int i = 1; i < n; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < n; i++) {
            if (fbv.isBadVersion(arr[i], bad)) {
                System.out.println("First bad version is " + arr[i]);
                break;
            }
        }
    }
}