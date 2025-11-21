class parent{
    public void m1(){
        System.out.println("parent class - m1 method");
    }
    public void m2(){
        System.out.println("parent class - m2 method");
    }
}

class child extends parent{
    public void m1(){
        System.out.println("child class - m1 method"); //over Riding method
    }
    public void m3(){
        System.out.println("child class - m2 method");
    }

    public static void main(String[] args){
        parent p1 = new parent();
        p1.m1();
        p1.m2();

        child c1 = new child();
        c1.m1();
        c1.m3();

        parent c2 = new parent();
        c2.m1();
        c2.m2();
    }
}