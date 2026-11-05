package Set;

import java.util.HashSet;
import java.util.Set;
import Set.entities.Product;
public class Program {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");
        System.out.println(set.contains("Notebook"));
        for (String p : set) {
            System.out.println(p);
        }
    }
}