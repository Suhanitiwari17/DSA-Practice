public class Reversearray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[] ans=reverseArray(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }
    }
    static int[] reverseArray(int[] arr,int start,int end){
        if(start>=end){
            return arr;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        return reverseArray(arr,start+1,end-1);
    }
}
