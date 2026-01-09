//User Defined

import java.util.Arrays;
import java.util.List;

interface consumerone {
    public abstract void accept(List enames);
}
class TestOne implements consumerone{
    public void accept(List enames){
        for(Object ename : enames){
            System.out.println(ename);
        }
    }

    public static void main(String[] args) {
        List<String> enames = Arrays.asList("RG","SG","PG");
        consumerone c1 = new TestOne();
        c1.accept(enames);
    }
}

//without Lambda

class TestTwo{
    public static void main(String[] args) {
        
        List<String> enames = Arrays.asList("RG","SG","PG");
        consumerone c1 = ename -> {
            for(Object name : enames){
                System.out.println(name);
            }
        };
        c1.accept(enames);
    }
}