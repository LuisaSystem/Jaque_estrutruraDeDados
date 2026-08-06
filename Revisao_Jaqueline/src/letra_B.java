import java.util.Scanner;

public class letra_B {
    public static void main(String[] args) {
        Scanner pa = new Scanner(System.in);

        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Coloque o número: ");
            num[i] = pa.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] == num[i]){
                num[i] = num[i - num[i]];
            }
        }


        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+"   ");

        }

    }
}
