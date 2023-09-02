package Basic;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        try (// int a = 4;
                Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            // int b = 10;
            int b = sc.nextInt();
            int c = a * b;
            System.out.println(c);
            String name = "Tony";
            System.out.println(name);
            a = b;
            System.out.println("a =" + a);
            System.out.println(square(4));
            ;
        }
    }

    public static int square(int side) {
        return side * side;
    }
}
