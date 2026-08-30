import java.util.Arrays;
import java.util.Random;

public class Atividade_1 {

        public static void cartas(int[] vet) {

            for (int i = 1; i < vet.length; i++) {
                int posi = vet[i];
                int j;
                for (j = i - 1; j >= 0 && vet[j] > posi; j--) {
                    vet[j + 1] = vet[j];
                }
                vet[j + 1] = posi;
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

    public static void bubbleEngine(int[] vet){

        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 0; j < vet.length  - 1 - i; j++) {
                if (vet[j] > vet[j+1]){
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
    }


    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        int[] vet = new int[1000];
        for (int i = 0; i < vet.length; i++) {
            Random mo = new Random();
            vet[i] = mo.nextInt(1000);
        }

        int[] vet2 = new int[1000];
        for (int i = 0; i < vet2.length; i++) {
            Random mo = new Random();
            vet2[i] = mo.nextInt(1000);
        }

        int[] vet3 = new int[1000];
        for (int i = 0; i < vet3.length; i++) {
            Random mo = new Random();
            vet3[i] = mo.nextInt(1000);
        }

        for (int i = 0; i < 1000000; i++) {
            bubbleEngine(vet);
            selecaoDireta(vet2);
            cartas(vet3);
        }


        long fim = System.currentTimeMillis();
        long tempoTotal = fim - inicio;


        System.out.println("===========================");
        System.out.println(Arrays.toString(vet));
        System.out.println("Tempo de execução: " + tempoTotal + " ms");
        System.out.println("\n"+Arrays.toString(vet2));
        System.out.println("Tempo de execução: " + tempoTotal + " ms");
        System.out.println(Arrays.toString(vet3));
        System.out.println("Tempo de execução: " + tempoTotal + " ms");
    }
}