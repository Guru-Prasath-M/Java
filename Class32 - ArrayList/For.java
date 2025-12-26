import java.util.*;
class For{
    public static void main(String[] args) {
        ArrayList<String> enames = new ArrayList<String>();
        System.out.println(enames);
        enames.add("Rahul Gandhi");
        enames.add("Sonia Gandhi");
        enames.add("Priyanka Gandhi");
        enames.add("Modi");
        System.out.println(enames);

        for(int i=0;i<=enames.size()-1; i++){
            System.out.println(enames.get(i));
        }
    }
}