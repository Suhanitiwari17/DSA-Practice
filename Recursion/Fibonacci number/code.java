public class Fibonacci1 {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

static int fibo(int n){
    if(n<2){
        return 1;
    }
    return fibo(n-1)+fibo(n-2);
}
}
