package Hashcode_Equals;
import Hashcode_Equals.entities.Client;
public class Program {
    static void main(String[] args) {
        Client a =  new Client("Lucas", "lucasbveloso7@gmail.com");
        Client b = new Client("Arthur", "arthurbveloso@gmail.com");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
