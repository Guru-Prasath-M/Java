package pack1;

class B {
    public void m5(){
        System.out.println("Defailt class B - Public method m5");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m4();

        B b = new B();
        b.m5();
    }
}
