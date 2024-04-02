import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("정수를 입력하세요. : ");
        select = s.nextInt();

        if(select % 3 == 0 && select % 5 == 0){
            System.out.print("3의 배수, 5의 배수 둘 다 만족합니다.");
        }
        else if(select % 3 == 0) {
            System.out.print("3의 배수 입니다.");
        }
        else if (select % 5 == 0) {
            System.out.print("5의 배수 입니다.");
        }
        s.close();
    }
}
