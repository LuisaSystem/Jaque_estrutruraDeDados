import java.util.ArrayList;
import java.util.Arrays;

public class Quicksort {
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

    public static void main(String[] args) {
        int[] w = {25, 57, 48, 37, 12, 92, 86, 33};
        quickly(w, 0, w.length-1);
        System.out.println(Arrays.toString(w));
    }
}
