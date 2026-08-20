import java.util.Arrays;

public class ordenacao {
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

    public static void selecaoDireta(int[] vet){

        for (int i = 0; i < vet.length - 1; i++) {
            int posi = i;
            for (int j = posi + 1; j < vet.length; j++) {
                int menor = vet[0];
                if( vet[j]  <  menor){
                    posi = j;
                }
            }

            int temp = vet[i];
            vet[i]  = vet[posi];
            vet[posi] = temp;
        }
    }

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
        int[] vet = {10, 20, 5, 8, 15};

        bubbleEngine(vet);
        selecaoDireta(vet);
        cartas(vet);
        System.out.println(Arrays.toString(vet));
    }
}
