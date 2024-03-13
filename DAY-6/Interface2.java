interface Interface {
    public void show1();
    default void show2(){
        System.out.println("This is show2() in Interface");
    }
    static void show3(){
        System.out.println("This is show3() in Interface");
    }
}
class Interface2 implements Interface{
    public void show1(){
        System.out.println("This is show1() in Class");
    }
    // public void show2(){
    //     System.out.println("This is show2() in Class");
    // }
    public void show3(){
        System.out.println("This is show3() in Class");
    }
    public static void main(String[] args) {
        Interface2 i = new Interface2();
        i.show1();
        i.show2();
        i.show3();
        Interface.show3();
    }
}