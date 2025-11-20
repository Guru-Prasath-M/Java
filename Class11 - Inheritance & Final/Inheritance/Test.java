class Test {
    public static void main(String[] args) {
        parent p1 = new parent();

        p1.m1();
        p1.m2();
        System.out.println("--------------------------------------");

        child c1 = new child();
        c1.m3();
        c1.m1();
        c1.m2();
        System.out.println("---------------------------------------");

        parent c2 = new child();
        c2.m1();
        c2.m2();
        System.out.println("---------------------------------------");

        // child p2 = new parent(); //Child cannot get parent object
    }
}
