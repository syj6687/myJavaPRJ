import java.util.Scanner;

public class Code10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("정수를 입력하세요 :");
        int number = s.nextInt();

        int min = number;
        int max = number;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= 2 * number - 1; j++) {
                if (j >= min && j <= max) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            min--;
            max++;
        }
    }
}
