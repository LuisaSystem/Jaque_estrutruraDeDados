
public class Buscabinaria {
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

    public static void main(String[] args) {
        int[] x = {3, 7, 10, 25, 30, 47, 50};
        int resp = busca(x, 0, x.length-1, 9);
        System.out.println("A busca foi? : "+resp);
    }
}
