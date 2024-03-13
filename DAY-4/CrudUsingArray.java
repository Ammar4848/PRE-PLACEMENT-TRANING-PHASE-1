import java.util.*;
public class CrudUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("Enter Your Choice");
        System.out.println("1. Input Data");
        System.out.println("2. Display Data");
        System.out.println("3. Update Data");
        System.out.println("4. Delete Data");
        System.out.println("5. Exit");
        int choice = sc.nextInt();
        while(choice != 5){
            switch(choice){
                case 1:
                    System.out.println("Enter Roll No");
                    int rollno = sc.nextInt();
                    System.out.println("Enter Name");
                    String name = sc.next();
                    System.out.println("Enter City");
                    String city = sc.next();
                    System.out.println("Enter Mobile No");
                    String mob = sc.next();
                    s.inputData(rollno, name, city, mob);
                    break;
                case 2:
                    s.displayData();
                    break;
                case 3:
                    System.out.println("Enter Roll No");
                    int rollno1 = sc.nextInt();
                    System.out.println("Enter Name");
                    String name1 = sc.next();
                    System.out.println("Enter City");
                    String city1 = sc.next();
                    System.out.println("Enter Mobile No");
                    String mob1 = sc.next();
                    s.updateData(rollno1, name1, city1, mob1);
                    break;
                case 4:
                    System.out.println("Enter Roll No");
                    int rollno2 = sc.nextInt();
                    s.deleteData(rollno2);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("------------------------------");
            System.out.println("Enter Your Choice");
            System.out.println("1. Input Data");
            System.out.println("2. Display Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Exit");
            System.out.println("------------------------------");
            choice = sc.nextInt();
        }
        sc.close();
    }
}
class Student{
    int rollno[] = new int[10];
    String name[] = new String[10];
    String city[] = new String[10];
    String mob[] = new String[10];
    int i=0;
    public void inputData(int rollno,String name,String city,String mob){
        this.rollno[i] = rollno;
        this.name[i] = name;
        this.city[i] = city;
        this.mob[i] = mob;
        i++;
    }
    public void displayData(){
        System.out.format("%s\t%s\t%s\t%s\n","RollNo","Name","City","Mobile No");
        for(int j=0;j<i;j++){
            System.out.println(rollno[j]+"\t"+name[j]+"\t"+city[j]+"\t"+mob[j]);
        }
        System.out.println("------------------------------");
    }
    public void updateData(int rollno,String name,String city,String mob){
        for(int j=0;j<i;j++){
            if(this.rollno[j] == rollno){
                System.out.println("Enter What you want to update");
                System.out.println("1. Name");
                System.out.println("2. City");
                System.out.println("3. Mobile No");
                Scanner cs = new Scanner(System.in);
                int choice = cs.nextInt();
                switch(choice){
                    case 1:
                        this.name[j] = name;
                        break;
                    case 2:
                        this.city[j] = city;
                        break;
                    case 3:
                        this.mob[j] = mob;
                        break;
                    default:
                        System.out.println("Invalid Choice");
                }
                cs.close();
            }
        }
    }
    public void deleteData(int rollno){
        for(int j=0;j<i;j++){
            if(this.rollno[j] == rollno){
                this.rollno[j] = 0;
                this.name[j] = null;
                this.city[j] = null;
                this.mob[j] = null;
            }
        }
    }
}