class InsertionSort{
	int in, out;
	public int[] sort(int arr[]){
		for(out = 0; out < arr.length; out++){
			int temp = arr[out];
			in = out;
			while(in > 0 && arr[in - 1] >= temp){
				arr[in] = arr[in - 1];
				in--;
			}
			arr[in] = temp;
		}
		return arr;
	}
	//public static void main(String args[]){ /*Driver Program.*/}
}