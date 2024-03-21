public class Star01 {
    public static void main(String[] args) {
        int cnt = 1;

        for (int i = 0; i <= 7; i++) {

            if(cnt <= 4){
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }
            if(cnt >= 5){
                for (int j = 0; j <= 6 - i; j++) {
                    System.out.print("*");
                }
            }

            System.out.println();
            cnt = cnt + 1;
        }
    }
}

