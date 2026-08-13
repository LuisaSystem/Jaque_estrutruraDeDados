import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.util.Arrays;

public class SelecaoDireta {
    public static void selecaoDireta(int[] vet){

        for (int i = 0; i < vet.length; i++) {
           // int menor = vet[i];
           // int posi = i;
            for (int j = 0; j < vet.length; j++) {
               int menor = vet[0];
               int posi = j;
                if( vet[j]  <  menor){
                    vet[i] = vet[j];

                }
            }
        }
    }

    public static void main(String[] args) {
        int[] vetor = {10,20,12,5,8,15};

        selecaoDireta(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
