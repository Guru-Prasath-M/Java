import java.util.*;
public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul");
        enames.add("Sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        System.out.println(enames);

       for (String ename : enames) {
        System.out.println(ename);
       }
    }
}
