import java.util.*;
class While{
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul Gandhi");
        enames.add("Sonia Gandhi");
        enames.add("Priyanka Gandhi");
        enames.add("Modi");
        System.out.println(enames);

        int i=0;
        while (i<=enames.size()-1) {
            System.out.println(enames.get(i));
            i++;
        }
    }
}