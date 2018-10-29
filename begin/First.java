package begin;

import java.util.HashSet;

/*
 * 10/28/18 Matthew Markose
 */
public class First {
	static int[] arr= {63,65,38,59,10,62,9,66,42,74,84,11,79,60,74,51,74,41,36,72,30,40,15,24,85,56,86,76,84,5};
	static HashSet<Integer> visited=new HashSet<Integer>();
	public static void main(String[] args){
		
		//Sort Array
		markoseSortNotVisited(0, arr.length-1);
		
		//Print Array
		for(int i:arr){
			System.out.println(i);
		}
	}

	private static void markoseSortNotVisited(int right, int left) {
		
		//if comparing itself or already visited
		if(right!=left && !visited.contains(right*arr.length+left)){
			
			// mark comparison as visited 
			visited.add(right*arr.length+left);
			
			// switch if left>right
			if(arr[right]>arr[left]){
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
			}
			
			//compare other indexes
			markoseSortNotVisited(right+1, left);
			markoseSortNotVisited(right, left-1);
		}
	}
	
	private static void markoseSortRepeatVisited(int right, int left) {
		//if comparing itself
		if(right!=left){
			
			// switch if left>right
			if(arr[right]>arr[left]){
				int temp=arr[right];
				arr[right]=arr[left];
				arr[left]=temp;
			}
			
			//compare other indexes
			markoseSortRepeatVisited(right+1, left);
			markoseSortRepeatVisited(right, left-1);
		}
	}
}
