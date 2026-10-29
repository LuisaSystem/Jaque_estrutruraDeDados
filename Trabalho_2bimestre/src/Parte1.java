import java.util.Arrays;

public class Parte1 {
    //função de parenteses e colchetes
    public static char sequenciaParenteses(char[] vet){
        for (int i = 0; i < vet.length; i++) {
            char aux = vet[i];
            if (aux == vet[i]){
                System.out.println("Correto!");
            }else{
                System.out.println("Errado!");
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        char[] x = {'[','[','(', ')', ']', ']'};
        char oio = sequenciaParenteses(x);

        System.out.println("Como ficou: " + Arrays.toString(x));
        System.out.println("Está bom? " + oio);
    }
}