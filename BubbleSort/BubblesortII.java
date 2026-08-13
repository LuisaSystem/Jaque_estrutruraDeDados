import java.lang.reflect.Array;
import java.util.Arrays;

public class BubblesortII {
    public static void bubbleEngine(int[] vet){

        for (int i = 1; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length  - 1 - i;) {
                if (vet[j] < vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }

        }
    }


    public static void main(String[] args) {
        int[] vet5 = {25, 57, 48, 37, 12, 92, 86, 33};

        bubbleEngine(vet5);
        System.out.println(Arrays.toString(vet5));


    }
}
