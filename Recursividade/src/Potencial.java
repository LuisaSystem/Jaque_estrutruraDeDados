public class Potencial {
    public static int pot(int base, int expoente){
        if (expoente == 0){
            return 1;
        }else {
            return base * pot(base, expoente-1);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int resp = pot(x, y);
        System.out.println("Bah: " + resp);
    }
}
