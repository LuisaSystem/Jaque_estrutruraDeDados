import java.util.Arrays;

public class BubblesortII {
    public static void bubbleEngine(int[] vet){

        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length  - 1 - i; j++) {
                if (vet[j] > vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            };
        }
    }


    public static void main(String[] args) {
        int[] vet = {25, 57, 48, 37, 12, 92, 86, 33};

        bubbleEngine(vet);

        System.out.println(Arrays.toString(vet));
    }
}
