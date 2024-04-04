import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        int a; // 입력값을 받기 위한 정수 정의
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력하세요. : ");
        a = s.nextInt(); //스캔으로 a에 입력값을 받음

        if(a % 21 == 0){ // a의 나머지 연산 21을 하면 3과 7의 배수를 모두 만족하는지 알 수 있음
            System.out.println("3과 7의 배수 모두 만족합니다.");
        }
        else if(a % 3 == 0){ // else if로 함으로서 print가 여러개 발동되지 않게 순서를 잘 만듦
            System.out.println("3의 배수입니다.");
        }
        else if(a % 7 == 0){
            System.out.println("7의 배수입니다.");
        }

    }
}
