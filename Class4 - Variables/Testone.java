class Test{
    int a = 10;
    int b = 20;
    static int c = 30;

    public static void main(String[] args) {
        Test t1 = new Test();

        Test t2 = new Test();
        System.out.println(t1.a + t2.a); //20

        t2.a = 11;
        System.out.println(t1.a + t2.a); //21

        System.out.println(t1.b + t2.b + Test.c); //70

        Test.c = 33;
        System.out.println(t1.b + t2.b + t1.c); //73  // We can t1.c or t2.c - because it is a Static
    }
}