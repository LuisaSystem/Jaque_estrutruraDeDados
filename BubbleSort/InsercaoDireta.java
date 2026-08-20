import java.util.Arrays;

public class InsercaoDireta {
    public static void cartas(int[] vet){

        for (int i = 0; i < vet.length + 2; i++) {
            int posi = i;
            for (int j = posi + i; j < vet.length; j++) {
                int aux = j;
                if (aux < posi){
                    vet[j] = posi - aux;
                    vet[i] = vet[j];
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] vet = {10,20,12,5,8,15};

        cartas(vet);
        System.out.println(Arrays.toString(vet));
    }
}
