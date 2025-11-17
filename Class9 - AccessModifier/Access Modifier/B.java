package pack1;
class B{
    public void m5(){
        System.out.println("Default class B- Public Method m5");
    }
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        a.m2();
        //a.m3();
        a.m4();
    }
}