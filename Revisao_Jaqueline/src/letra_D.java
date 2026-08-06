import java.util.Random;

public class letra_D {
    public static void main(String[] args) {
        Random dale = new Random();

        int[] vet = new int[50];

        int dot = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = dale.nextInt(10);
            dot += vet[i];
        }

        for (int i = 0; i < vet.length; i++) {
            if(dot%2 == vet[i]){

            }
        }
        System.out.println("================");
        System.out.println(dot);
    }
}
