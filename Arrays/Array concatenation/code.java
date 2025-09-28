import java.util.Scanner;
public class arrayconcatenation {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter"+" "+n+" "+"elements:");
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

        int[] result=new int[2*n];
        for(int i=0;i<result.length;i++){
           if(i<n) {
            result[i]=nums[i];
           }
           else{
            result[i]=nums[i-n];
           }
        }
        System.out.println("The modified array is:");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    
}
}
