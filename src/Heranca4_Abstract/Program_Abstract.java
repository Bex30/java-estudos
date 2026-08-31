package Heranca4_Abstract;

import Heranca4_Abstract.entities.enums.Color;
import Heranca4_Abstract.entities.ShapeAbs;
import Heranca4_Abstract.entities.RectangleAbs;
import Heranca4_Abstract.entities.CircleAbs;
import java.util.*;

public class Program_Abstract {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<ShapeAbs> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new RectangleAbs(color, width, height));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new CircleAbs(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (ShapeAbs shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }

        sc.close();
    }
}
