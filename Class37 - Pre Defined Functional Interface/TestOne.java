//FUNCTIONAL INTERFACE WITHOIT USING LAMBDA EXPRESSION

interface FunctionI{
    public abstract int apply(String name);
}

class TestOne implements FunctionI{
    public int apply(String name){
        return name.length();
    }

    public static void main(String[] args) {
        FunctionI t1 = new TestOne();
        System.out.println(t1.apply("Rahul"));
        System.out.println(t1.apply("Guru"));
    }
}