import java.util.Scanner;
public class runningsumarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter"+" "+n+" "+"elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int[] brr=new int[n];
        brr[0]=arr[0];
        int sum=arr[0];
        for(int i=1;i<n;i++){
            brr[i]=arr[i]+sum;
            sum=brr[i];
        }

        System.out.println("The Final array is:");
        for(int i=0;i<n;i++){
            System.out.print(brr[i]+" ");
        }

    }
}
