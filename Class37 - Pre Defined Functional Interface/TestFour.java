import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

interface TestFour {
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG", "SG", "PG");
        Function<List, Integer> f = names->(names.size());
        System.out.println(f.apply(enames));
    }
} 