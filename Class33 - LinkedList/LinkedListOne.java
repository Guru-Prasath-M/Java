import java.util.*;
class LinkedListOne{
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40);
        ArrayList<Integer> eids = new ArrayList<>(Arrays.asList(10,20,30,40));
        LinkedList<Integer> uids = new LinkedList<>(Arrays.asList(10,20,30,40));

        eids.set(0, 5);
        eids.add(50);
        System.out.println(eids);
        uids.addFirst(50);
        uids.addLast(60);
        System.out.println(uids);
        uids.removeFirst();
        System.out.println(uids);
    }
}