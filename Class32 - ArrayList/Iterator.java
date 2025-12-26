import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class TestIterator{
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<>();
        System.out.println(enames);
        enames.add("Rahul Gandhi");
        enames.add("Sonia Gandhi");
        enames.add("Priyanka Gandhi");
        enames.add("Modi");
        System.out.println(enames);

        Iterator itr = enames.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(enames);
        System.out.println(enames);
        Collections.sort(enames,Collections.reverseOrder());
        System.out.println(enames);
        
    }
}
