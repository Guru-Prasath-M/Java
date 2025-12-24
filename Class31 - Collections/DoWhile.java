import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        ArrayList<String> enmaes = new ArrayList<String>();
        System.out.println(enmaes);
        enmaes.add("Rahul");
        enmaes.add("Sonia");
        enmaes.add("Priyanka");
        enmaes.add("Modi");
        System.out.println(enmaes);

        int i=0;
        do {
            System.out.println(enmaes.get(i));
            i++;
        } while (i<=enmaes.size()-1);
    }
}
