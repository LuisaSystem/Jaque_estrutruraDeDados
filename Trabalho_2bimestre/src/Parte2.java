public class Parte2 {
    //de 1 a N - logo eu posso escolher
    // quantas pessoas de um a N
    public static final int N = 10;
    public static int pessoasExcluidas(int[] vet){

        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = aux;
            aux = vet[i]/N;
        }
        return aux;
    }


    public static void main(String[] args) {
        int[] v = {1, 3, 4, 6, 0, 7, 8, 12, 9, 0};
        int c = pessoasExcluidas(v);
        System.out.println("O número da pessoa excluída é: " + c);
    }
}
