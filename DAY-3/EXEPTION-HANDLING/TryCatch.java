public class TryCatch {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);;
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println(""+c);
        }
        catch(ArithmeticException ae){
            System.out.println("Arethmatic exeption occured"+1);
        }
        catch(NumberFormatException nfe){
            System.out.println("Number format exeption occured"+2);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Array Index exeption occured"+3);
        }
    }   
}