import java.util.Scanner;

public class If06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score;

        System.out.print("점수 입력 ==> ");
        score = s.nextInt();

        if (score >= 90){
            System.out.print("A");
        }
        else{
            if (score >= 80){
                System.out.print("B");
            }
        }
    }
}
