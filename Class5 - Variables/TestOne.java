//INTERGER DEFAULT IS 0
//STRING DEFAULT IS NULL

class Test{
    int a; 
    static String S;
    byte b;
    float f;
    double d;
    char c;
    boolean bl;
    long l;
    short s;


    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.a); //0
        System.out.println(t1.S); //null
        System.out.println(t1.b); //null
        System.out.println(t1.f); //null
        System.out.println(t1.d); //null
        System.out.println(t1.c); //null
        System.out.println(t1.bl); //null
        System.out.println(t1.l); //null
        System.out.println(t1.s); //null
    }
}