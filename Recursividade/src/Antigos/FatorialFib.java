public class FatorialFib {
    public static int fib(int num){
        if (num == 1 || num == 2){
            return 1;
        }else {
            return fib(num-1) + fib(num-2);
        }
    }

    public static void main(String[] args) {
        int x = 3;
        int resp = fib(x);
        System.out.println("Fibonnacci: "+ resp);
    }
}
