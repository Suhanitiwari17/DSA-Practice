public class linearsearchwithrec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,18,9};
        int target=9;
        System.out.println(linearSearch(arr,0,target));
    }
    static int linearSearch(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearSearch(arr,index+1,target);
    }
}
