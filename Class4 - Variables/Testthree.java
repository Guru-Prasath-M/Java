class Test{
    int a = 10;
    static int b = 20;

    public void m1(){
        int c = 30;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Test t1 = new Test();

        System.out.println(t1.a); //10
        System.out.println(t1.b); //20
        System.out.println(Test.b); //20

        // System.out.println(c); // Compile time error - because it is a local variable... It will be used in only in that method.
    }

}
