//USING LAMBDA EXPRESSION

@FunctionalInterface
interface LambdaOne {
    public abstract boolean test(String ename);
}

class TestTwo{
    public static void main(String[] args) {
        LambdaOne l = (name)->name.length() >= 5;
        System.out.println(l.test("Raj"));
    }
}