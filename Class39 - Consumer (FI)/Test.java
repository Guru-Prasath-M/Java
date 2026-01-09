import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Test{
    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        Consumer<List> c = names->{for(Object name : names){
            System.out.println(name);
        }};
        c.accept(enames);
    }
}