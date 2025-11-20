package pack1;

public class A {
    public void m1(){
        System.out.println("Public class A - Public Method m1");
    }

    void m2(){
        System.out.println("Public Class A - Default Method m2");
    }

    private void m3(){
        System.out.println("Public Class A - Private method m3");
    }

    protected void m4(){
        System.out.println("Public Class A - Protected method m4");
    }
}
