import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int n=arr.size();
        int first=m+1;
        int last=n-1;
        while(first<last){
            int temp=arr.get(first);
            arr.set(first,arr.get(last));
            arr.set(last,temp);
            first++;
            last--;
        }
        
    }
}
