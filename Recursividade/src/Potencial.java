public class Potencial {
    public static int pot(int expoente,  int base){
        if (expoente == 0){
            return 1;
        }else {
            return base * pot(base, expoente-1);
        }
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 3;
        int resp = pot(x, y);
        System.out.println("Bah: " + resp);
    }
}
