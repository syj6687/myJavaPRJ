import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if(num < 100){
            System.out.print("100보다 ");
            System.out.print("작습니다.");
        }
    }
}