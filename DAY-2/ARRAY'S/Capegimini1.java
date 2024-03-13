import java.util.*;
public class Capegimini1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of semesters: ");
        int noOfSemesters = sc.nextInt();
        int noOfSubjects[] = new int[noOfSemesters];
        int highestMarks[] = new int[noOfSemesters];
        for (int i = 1; i <= noOfSemesters; i++) {
            System.out.println("Enter the number of subjects in " + i + " semester: ");
            noOfSubjects[i - 1] = sc.nextInt();
        }
        for (int j = 1; j <= noOfSemesters; j++) {
            System.out.println("Enter the marks of " + j + " semester: ");
            int marks[] = new int[noOfSubjects[j - 1]];
            for (int k = 0; k < noOfSubjects[j - 1]; k++) {
                marks[k] = sc.nextInt();
            }
            int highest = marks[0];
            for (int l = 0; l < noOfSubjects[j - 1]; l++) {
                if (marks[l] > highest) {
                    highest = marks[l];
                }
            }
            highestMarks[j - 1] = highest;
        }
        for (int i = 0; i <= highestMarks.length - 1; i++) {
            System.out.println("Highest marks in " + (i + 1) + " semester: " + highestMarks[i]);
        }
        sc.close();
    }
}