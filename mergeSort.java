public class main
{
	
	public static void main(String[] args) {
		
	int [] arr = {9, 4, 5, 7, 11, 12};
	mergeSort(arr);
	print(arr); // 4,5,7,9,11,12
	
	}
	
	public static int [] mergeSort(int [] arr){
		
		int arrLen = arr.length;
		if(arrLen < 2) {return arr;}
		int [] left = new int[arrLen/2];
		int [] right = new int[arrLen - (arrLen/2)];
		
		for(int i = 0; i < left.length; i++){
			left[i] = arr[i];
		}
		for(int i = arrLen/2; i < arr.length; i++){
			right[i - (arrLen/2)] = arr[i];
			System.out.println(right[i - (arrLen/2)]);
		}

		mergeSort(left); mergeSort(right);
		return merge(left, right, arr);
	}
	
	public static int [] merge(int[] L, int [] R, int [] arr){
		
		int lenL = L.length;
		int lenR = R.length;
		int i = 0; // pointer for L
		int j = 0; // pointer for R
		int k = 0; // smallest unpicked 
		
		while(i < lenL && j < lenR){
			if(L[i] <= R[j]){
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			} k++;
		}
			
		while(i < lenL){
			arr[k] = L[i];
			i++; k++;
		}

		while(j < lenR){
			arr[k] = R[j];
			j++; k++;
		}
		return arr;
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
	
}
