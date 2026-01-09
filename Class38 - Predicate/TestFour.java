import java.util.List;
import java.util.Arrays;
import java.util.function.Predicate;

class TestFour {
    public static void main(String[] args) {
        Predicate<List> p1 = enames->enames.isEmpty();
        System.out.println(p1.test(Arrays.asList(10,20,30)));
    }
}
