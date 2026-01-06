
interface Calc {
    int add(int a, int b);
}

class CalcImpl implements Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        CalcImpl ci = new CalcImpl();
        System.out.println(ci.add(10, 20));
    }
}
