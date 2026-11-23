import java.util.*;

class CollectionDemo {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();

        students.add("Priya");
        students.add("Karan");
        students.add("Aman");

        System.out.println("ArrayList Elements:");

        Iterator<String> itr = students.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // HashMap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Priya");
        map.put(102, "Karan");
        map.put(103, "Aman");

        System.out.println("\nHashMap Elements:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}
