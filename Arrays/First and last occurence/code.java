import java.util.Scanner;
public class firstnlastoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        System.out.println("Enter array elements:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Enter the element whose occurence you want to check:");
        int ele=sc.nextInt();

        int[] result=occurence(arr,ele);
        for(int i=0;i<2;i++){
            System.out.print(result[i]+" ");
        }


        
    }
    static int[] occurence(int[] nums,int a){
        int count=0;
        int t=0;
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==a){
                 t=i;
                count++;
            }
            if(count==1){
                ans[0]=t;
            }
            
        }
        if(count==0){
            ans[0]=-1;
            ans[1]=-1;
            return ans;
        }
        else{
          ans[1]=t;
          return ans;
        }
    }
    
}
