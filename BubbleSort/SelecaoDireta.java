import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Arrays;

public class SelecaoDireta {
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

    public static void main(String[] args) {
        int[] vetor = {10,20,12,5,8,15};

        selecaoDireta(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
