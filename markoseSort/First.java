package begin;
/*
 * 10/28/18 Matthew Markose
 */
public class First {
	static int[] arr= {63,65,38,59,10,62,9,66,42,74,84,11,79,60,74,51,74,41,36,72,30,40,15,24,85,56,86,76,84,5};
	public static void main(String[] args){
		
		//Sort Array
		markoseSort(0, arr.length-1);
		
		//Print Array
		for(int i:arr){
			System.out.println(i);
		}
	}

	private static void markoseSort(int i, int j) {
		
		//if comparing itself
		if(i!=j){
			
			// switch if left>right
			if(arr[i]>arr[j]){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			//compare other indexes
			markoseSort(i+1, j);
			markoseSort(i, j-1);
		}
	}
}
