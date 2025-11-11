//LOCAL VARIABLE

class Test {
    int a = 100;
    static int b = 200;

    public void m1(){
        int c = 300; //Local variable
        System.out.println(c);
    }

    public void m2(){
        int d; //Local variable
        // System.out.println(d); // Because not initialization ---- Before using local variable we have to initialization
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.a);
        t1.m1();
        t1.m2(); 
    }
}
