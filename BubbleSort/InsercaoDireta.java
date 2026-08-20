import java.util.Arrays;

public class InsercaoDireta {
    public static void cartas(int[] vet){

        for (int i = 1; i < vet.length; i++) {
            int posi = vet[i];
            int j;
            for (j = i-1; j >=0 && vet[j] > posi; j--) {
                    vet[j+1] = vet[j];
            }
             vet[j+1] = posi;
        }
    }


    public static void main(String[] args) {
        int[] vet = {10,20,12,5,8,15};

        cartas(vet);
        System.out.println(Arrays.toString(vet));
    }
}
