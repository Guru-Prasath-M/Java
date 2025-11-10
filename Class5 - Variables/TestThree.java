class Test{
    int [] eids = new int[4];

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.eids[0] = 101;
        t2.eids[0] = 1001;
        t1.eids[1] = 102;
        t2.eids[1] = 1002;

        System.out.println(t1.eids[0]); //101
        System.out.println(t1.eids[1]); //1001
        System.out.println(t2.eids[0]); //102
        System.out.println(t2.eids[1]); //1002
        System.out.println(t2.eids[2]); //0
        System.out.println(t2.eids[5]); // Index 5 out of BOUND
    }
}