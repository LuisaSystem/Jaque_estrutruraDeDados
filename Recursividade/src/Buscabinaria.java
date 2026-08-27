import java.lang.reflect.Array;
import java.util.Arrays;

public class Buscabinaria {
    public static int busca(int[] num){
        for (int i = 0; i < num[7]; i++) {
            if (num[i] <= 0){
                return 1;
            }else {
                return busca(num);
            }
        }
        //return busca(num-num.length);
        return 0;
    }

    public static void main(String[] args) {
        int[] x = {3, 7, 10, 25, 30, 47, 50} ;
        int resp = busca(x);
        System.out.println("A busca foi? : "+resp);
    }
}
