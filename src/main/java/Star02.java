public class Star02 {
    public static void main(String[] args) {

        for(int i = 0; i < 4; i++){
            for(int j = 3; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2 + 2; k+=2){
                System.out.print("*");
            }
            if(i > 0){
                for(int l = 0; l < i; l++){
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
