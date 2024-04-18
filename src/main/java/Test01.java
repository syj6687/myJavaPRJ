import java.util.Arrays;

class Test01{
	public static void main(String[] args) {
        int[] iArr = {100, 90, 80, 70, 60};

        System.out.println(Arrays.toString(iArr)); //간편하게

        for(int i = 0 ; i < iArr.length; i++){ //하드코딩
            System.out.println(iArr[i]);
        }

	}
}
