public class main
{
	
	public static void main(String[] args) {
		
	int [] arr = {8, 5, 3, 9, 2, 11, 12,22, 44, 9, -1, 4, 6};
	quickSort(arr, 0, arr.length-1);
	print(arr);
	// returns -1,2,3,4,5,6,8,9,9,11,12,22,44
	
	}
	
	public static void print(int [] arr){
		for(int i = 0; i < arr.length; i++){
			String print = (i == arr.length - 1) ?  ""  : ",";
			System.out.print(arr[i] + print);
		}System.out.println();
	}
	
	public static void swap(int[] arr, int i, int j){	
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	
	public static int partitionForQuickSort(int [] arr, int startIndex, int endIndex){
		//print(arr);
		int pivot = arr[endIndex];
		int pivotIndex = endIndex;
		int partitionIndex = startIndex;	
		for(int i = startIndex; i < endIndex; i++ ){		
			if(arr[i] <= pivot ){
				swap(arr, i, partitionIndex);
				partitionIndex++;
			}
		}
		swap(arr,partitionIndex,pivotIndex);
		return partitionIndex;
	}
	
	public static int[] quickSort(int [] arr, int startIndex, int endIndex){
		
		if(startIndex < endIndex){
			int partitionIndex = partitionForQuickSort(arr, startIndex, endIndex);
			quickSort(arr, startIndex, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, endIndex);
		}
		return arr;
	}
	
}
