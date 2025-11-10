class Test{
    int a; //Instance Variable
    int b = 10;
    static int c = 20; //Static Variable
    int [] eids = new int[4];

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        // System.out.println(a); //Compile Time Error --> We can't access instance variable directly
        System.out.println(t1.a); //0 - Because Default Value for int is 0
        System.out.println(t1.a + t2.b); //10
        System.out.println(c + t1.c + Test.c); //60
    }
}