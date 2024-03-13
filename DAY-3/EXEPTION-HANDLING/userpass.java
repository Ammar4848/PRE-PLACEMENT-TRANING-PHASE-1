public class userpass {
    public static void check(String uname, String upass) throws Invaliduserpass {
        if (uname.equals("admin") && upass.equals("admin")) {
            System.out.println("Login Succesfully");
        }
        else{
            throw new Invaliduserpass("Invalid User Name or Password");
        }
    }
    public static void main(String[] args) throws Invaliduserpass {
        String uname = args[0];
        String upass = args[1];
        check(uname,upass);
    }
}
class Invaliduserpass extends Exception {
    public Invaliduserpass(String str){
        System.out.println(str);
    }
}