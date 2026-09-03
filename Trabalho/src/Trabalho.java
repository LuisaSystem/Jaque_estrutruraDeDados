import java.util.Arrays;
import java.util.Random;

public class Trabalho{

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

    public static void incersaoDireta(int[] vet){

        for (int i = 1; i < vet.length; i++) {
            int posi = vet[i];
            int j;
            for (j = i-1; j >=0 && vet[j] > posi; j--) {
                vet[j+1] = vet[j];
            }
            vet[j+1] = posi;
        }
    }

    public static void quickly(int[] vet, int left, int rigth){
        int i = left;
        int j = rigth;
        int aux;
        int pivotidx = (left + rigth)/2;
        int pivot = vet[pivotidx];

        //partição
        while (i <= j){
            while (vet[i] < pivot){
                i++;
            }
            while (vet[j] > pivot){
                j--;
            }
            if (i <= j){
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                i++;
                j--;
            }
        }
        //recursão
        if (left < j){
            quickly(vet, left, j);
        }if (i < rigth){
            quickly(vet, i, rigth);
        }

    }
    //contante a ser mudada
    // 1. de 100
    public static final int tam = 100;

    public static void main(String[] args) {
        int[] vetran = new int[tam];
        int[] vetcres = new int[tam];
        int[] vetdes = new int[tam];



























































    }
}