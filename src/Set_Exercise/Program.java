package Set_Exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import Set_Exercise.entities.users;

public class Program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<users> set = new HashSet<>();
        System.out.print("How many students for course A?");
        int A = sc.nextInt();
        for(int i = 0; i < A; i++){
            int student = sc.nextInt();
            set.add(new users(student));
        }
        System.out.print("How many students for course B?");
        int B = sc.nextInt();
        for(int i = 0; i < B; i++){
            int student = sc.nextInt();
            set.add(new users(student));
        }
        System.out.print("How many students for course C?");
        int C = sc.nextInt();
        for(int i = 0; i < C; i++){
            int student = sc.nextInt();
            set.add(new users(student));
        }
        System.out.println("Total students: " + set.size());
    }
}
