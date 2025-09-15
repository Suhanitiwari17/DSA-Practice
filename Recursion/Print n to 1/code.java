public class print1ton {
    public static void main(String[] args) {
        print(6);
    }
    static void print(int n){
        if(n==0){
            return;
        }
        //print(n-1);
        System.out.println(n);
        print(n-1);
    }
}
