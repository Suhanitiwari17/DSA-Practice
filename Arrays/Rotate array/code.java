import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int n=arr.size();
        ArrayList<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            temp.add(arr.get(i));
        }
        for(int i=k;i<n;i++){
            arr.set((i-k),arr.get(i));

        }
        int j=0;
        for(int i=n-k;i<n;i++){
            arr.set(i,temp.get(j));
            j++;

        }
        return arr;
    }
}
