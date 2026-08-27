package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class List_teste {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();//ArrayList<String ou o declarado> nas versões mais antigas

        list.add("Maria");
        list.add("Alex");
        list.add(0,"Jacob");
        list.add(3,"Lucas");
        list.add("Manuela");
        list.add("Zacari");
        list.add("Zas");

        System.out.println(list.size());


        list.remove("Alex"); //pode ser por numero tbm, list.remove(1);
        for(String x : list){
            System.out.println(x);

        }
        System.out.println("--------------------");
        list.remove("Alex"); //pode ser por numero tbm, list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');


        for(String x : list){
            System.out.println(x);
        }
        System.out.println("--------------------");
        System.out.println("Index of Lucas: " + list.indexOf("Lucas"));
        System.out.println("--------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').toList();
        for(String x : result){
            System.out.println(x);
        }
        System.out.println("--------------------");
        String nameZ =  list.stream().filter(x -> x.charAt(0) == 'Z').findFirst().orElse(null);
        System.out.println(nameZ);

    }
}
