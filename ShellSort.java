class ShellSort{
	int n = 10; //Number of elements
	int theArray = new int[10]; //the array to sort. Assume stored array.
	public void sort(){
		int inner, outer;
		int temp;

		int h = 1;
		while(h <= n/3){
			h = h*3 + 1;
		}

		while(h > 0){
			for(outer = h; outer < n; outer++){
				temp = theArray[outer];
				inner = outer;

				while(inner > h-1 && theArray[inner-h] >= temp){
					theArray[inner] = theArray[inner-h];
					inner -= h;
				}
				theArray[inner] = temp;
			}
			h = (h-1)/3;
		}
	}
}