public class Parte3 {
    public static void Hashing(String in, int busca){

        int vet[] = new int[9];
        for (int i = 0; i < vet.length; i++) {
            in = String.valueOf(vet.length);
            for (int j = 0; j < vet.length; j++) {
                busca = vet[i];
                j++;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        String[] vet = {"R", "O", "P", "E", "L"};
        Hashing("R", 9);

        System.out.println("Resultado: ");
    }
}
