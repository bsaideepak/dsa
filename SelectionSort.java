class SelectionSort{
	public int[] sort(int arr[]){
		for(int i = 0; i < arr.length; i++){
			int min = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[min]){
					int temp = arr[min];
					arr[min] = arr[j];
					arr[j] = arr[min];
				}
			}
		}
		return arr;
	}
	//public static void main(String args[]){ /*Driver Program.*/}
}