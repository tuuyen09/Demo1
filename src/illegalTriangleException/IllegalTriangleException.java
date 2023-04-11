package illegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();

        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0){
            if (a + b > c && a + c > b && b + c > a){
                System.out.println("a, b, c là 3 cạnh của tam giác.");
            } else {
                System.out.println("a, b, c không phải 3 cạnh của tam giác.");
            }
        } else {
            System.out.println("a, b, c không phải 3 cạnh của tam giác.");
        }
    }
}
