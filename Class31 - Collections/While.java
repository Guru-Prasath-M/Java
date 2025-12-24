import java.util.*;
public class While {
    public static void main(String[] args) {
        ArrayList<String> enmaes = new ArrayList<String>();
        System.out.println(enmaes);
        enmaes.add("Rahul");
        enmaes.add("Sonia");
        enmaes.add("Priyanka");
        enmaes.add("Modi");
        System.out.println(enmaes);

        int i=0;
        while(i<=enmaes.size()-1){
            System.out.println(enmaes.get(i));
            i++;
        }
    }
}
