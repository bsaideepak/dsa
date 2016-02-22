class MergeSort{
	//Merge Sort without recursion.
	public int[] sort(int[] arrA, int sizeA, int[] arrB, int sizeB, int[] result){
		int indexA = 0, indexB = 0, indexR = 0;

		while(indexA < sizeA && indexB < sizeB){
			if(arrA[indexA] < arrB[indexB]){
				result[indexR++] = arrA[indexA++];
			}else{
				result[indexR++] = arrB[indexB++];
			}
		}

		while(indexA < sizeA){
			result[indexR++] = arrA[indexA++];
		}

		while(indexB < sizeB){
			result[indexR++] = arrB[indexB++]; 
		}
		return result;
	}

	//Recursive Merge Sort.

	public void recMergeSort(int[] arr, int low, int high){
		if(low == high){
			return;
		}else{
		
			int mid = (low + high)/2;
			
			recMergeSort(arr, low, mid);
			
			recMergeSort(arr, mid+1, high);

			merge(arr, low, mid+1, high, result);
		}
	}
	/*
	public void merge(int[] arr, int low, int mid, int high, int[] result){
		int indexR = 0;
		int middle = mid - 1;
		int numOfItems = high - low + 1;

		while(low <= middle && mid <= high){
			if(arr[low] < result[high]){
				arr[indexR++] = 
			}
		}
	}
	*/

}