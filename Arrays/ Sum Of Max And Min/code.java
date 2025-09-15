import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int min=arr[0];
      for(int i=1;i<n;i++){
        if(arr[i]<min){
          min=arr[i];
        }
      }
      int max=arr[0];
      for(int i=1;i<n;i++){
        if(arr[i]>max){
          max=arr[i];
        }
      }
      int sum=min+max;
      return sum;
  }
}
