
public class String1{
    public static void main(String[] args) {
        String a = "ammar";
        String b =" Nagarji ";
        System.out.println(a.toLowerCase());
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.indexOf("a"));
        System.out.println(a.lastIndexOf("a"));
        System.out.println(b.trim());
        System.out.println(a.startsWith("a"));
        System.out.println(a.equalsIgnoreCase("aMMAR"));
        System.out.println(a.substring(2));
        System.out.println(a.concat(b));
        System.out.println(a.replace('A','a'));
        System.out.println(a.compareTo(b));
    }

    // public static void fun1(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter The String");
    //     String s = sc.next();
        

    // }
}