//USING PREDEFINED FUNCTIONAL INTERFACE

import java.util.function.Predicate;

class TestThree {
    public static void main(String[] args) {
        String ename = "Rajini";
        Predicate<String> p1 = name->name.length() >= 5;
        System.out.println(p1.test(ename));
    }
}
