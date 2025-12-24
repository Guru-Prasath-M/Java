import java.util.*;
public class For {
    public static void main(String[] args) {
        ArrayList<String> enmaes = new ArrayList<String>();
        System.out.println(enmaes);
        enmaes.add("Rahul");
        enmaes.add("Sonia");
        enmaes.add("Priyanka");
        enmaes.add("Modi");
        System.out.println(enmaes);

        for(int i=0 ; i<=enmaes.size()-1 ; i++){
            System.out.println(enmaes.get(i));
        }
    }
}
