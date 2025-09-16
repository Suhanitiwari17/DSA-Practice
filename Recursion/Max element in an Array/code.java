public class maxInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,48,5,9,68};
        System.out.println(findMax(arr,0,arr[0]));
    }
    static int findMax(int[] arr,int index,int max){
        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            max=arr[index];
        }
        return findMax(arr,index+1,max);
    }
}
