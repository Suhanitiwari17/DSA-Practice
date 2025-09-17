public class sumofdigits {
    public static void main(String[] args) {
        int ans=sum(1342);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }
        int d=n%10;
        return d+sum(n/10);
    }
}
