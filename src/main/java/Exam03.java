import java.util.Scanner;

public class Exam03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = a * b;
        System.out.print(a + "*" + b + "=" + c);
    }
}
