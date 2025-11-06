class Test {
    int eid = 101;
    String ename = "Guru";
    static String org_name = "TCS";

    public static void main(String[] args) {
        Test t1 = new Test();

        System.out.println(t1.org_name); //Using Object
        System.out.println(Test.org_name); //Using Class Name 
        System.out.println(org_name); //Using Directly
    }
}
