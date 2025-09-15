import java.util.ArrayList;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		for(int i=0;i<n;i++){
			int min=arr.get(i);
			for(int j=i+1;j<n;j++){
				if(arr.get(j)<min){
					min=arr.get(j);
					arr.set(j,arr.get(i));
					arr.set(i,min);
				}
			}
		}
		int smallest=arr.get(k-1);
		int largest=arr.get(n-k);
		ArrayList<Integer> list=new ArrayList<>();
		list.add(smallest);
		list.add(largest);
		return list;
	}
}
