import java.util.Arrays;

public class SequencialBi {

    //busca sequencial
    public static void sequencial(int[] vet){
        int aux;
        for (int i = 0; i < vet.length; i++) {
            int x = 0;
            if (vet[i] == x){
                aux = x;
                vet[i] = aux;
                System.out.println(Arrays.toString(vet));
            }
        }
    }

    //bunca binária - recursiva
    public static int busca(int[] vet, int i, int f, int x){
        int meio;
        if (i > f){
            return -1;
        }else{
            meio = (i + f) / 2;
            if (vet[meio] == x){
                return meio;
            } else if (x < vet[meio]) {
                return busca(vet, i, meio-1,x);
            }else {
                return busca(vet, meio+1, f, x);
            }

        }
    }

    //busca binária - não recursiva
    public static void buscaII(int[] vet, int i, int f, int x){
        int meio;
        if (i > f){
            System.out.println("no");
        }else {
            meio = (i + f)/2;
            if (vet[meio] == x){
                System.out.println(meio);
            } else if (x < vet[meio]) {
                System.out.println("Resul1: "+ Arrays.toString(vet)+", "+i+", "+(meio-1)+", "+x+".");
            }else {
                System.out.println("Resul2: "+ Arrays.toString(vet)+", "+(meio+1)+", "+f+", "+x+".");
            }
        }
    }



    // tamanho do vetor
    // 1. 10
    // 2. 100
    // 3. 100.000
    public static final int tam = 100000;
    public static void number(int[] vet){
        int j = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = j;
            j+=2;
        }
    }


    public static void main(String[] args) {
        int[] p = new int[tam];
        number(p);

        //SEQUENCIAL
        long inicio = System.nanoTime();
        long fim = System.nanoTime();
        long tempo = fim - inicio;
        double dura = tempo/1000000.0;
        sequencial(p);
        System.out.println(Arrays.toString(p));
        System.out.println("tempo: "+dura);

        System.out.println("================================");

        //BUSCA - RECURSIVA
        inicio = System.nanoTime();
        fim = System.nanoTime();
        tempo = fim - inicio;
        dura = tempo/1000000.0;
        busca(p, 0, p.length-1, 9);
        System.out.println(Arrays.toString(p));
        System.out.println("tempo: "+dura);

        System.out.println("================================");

        //BUSCA - NÂO RECURSIVA
        inicio = System.nanoTime();
        fim = System.nanoTime();
        tempo = fim - inicio;
        dura = tempo/1000000.0;
        buscaII(p,0, p.length-1, 9);
        System.out.println(Arrays.toString(p));
        System.out.println("tempo: "+dura);

    }
}