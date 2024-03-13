interface RBI {
    public void rateOfInterest();
}
class SBI implements RBI{
    public void rateOfInterest(){
        System.out.println("This is Rate Of Intreset Implemented By SBI class");
    }
}
class Canra implements RBI{
    public void rateOfInterest(){
        System.out.println("This is Rate Of Intreset Implemented By Canra class");
    }
}
class Bob implements RBI{
    public void rateOfInterest(){
        System.out.println("This is Rate Of Intreset Implemented By Bob class");
    }
}
public class Bank {
    public static void main(String[] args) {
        RBI r1,r2,r3;
        r1 = new SBI();
        r2 = new Canra();
        r3 =new Bob();
        r1.rateOfInterest();
        r2.rateOfInterest();
        r3.rateOfInterest();
    }  
}