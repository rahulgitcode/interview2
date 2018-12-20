
public class QuickSortClass{
	private long[] array;
	private int nElems;
	
	public QuickSortClass(int max){
		array = new long[max];
		nElems = 0;
	}
	
	public void insert(long element){
		array[nElems] = element;
		nElems++;
	}
	
	public int size(){
		return nElems;
	}
	
	public void display(){
		for(int i =0; i< nElems; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
	
	public void quickSort(){
		recQuickSort(0, nElems-1);
	}
	
	public void recQuickSort(int left, int right){
		
		if((right - left) == 0){
			return;
		}
		
		long pivot = array[right];
		
		int partIndx = partitionIt(left, right, pivot);
		recQuickSort(left,partIndx-1);
		recQuickSort(partIndx+1,right);
		
	}
	
	public int partitionIt(int left, int right, long pivot){
		int leftPtr = left-1;
		int rightPtr = right;
		
		while(true){
			while(array[++leftPtr]< pivot){
				//do nothing
			}
			
			while(rightPtr>0 && array[--rightPtr]>pivot){
				//do nothing
			}
			
			if(leftPtr>=rightPtr){
				break;
			}
			else{
				swap(leftPtr,rightPtr);
			}
			
			
		}
		swap(leftPtr, right); //swap and put the pivot at right spot
		return leftPtr;
	}
	
	public void swap(int left, int right){
		long temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	static class shellSortApp{
		public static void main(String[] args){
			
			int maxSize = 16;
			
			QuickSortClass quick;
			quick = new QuickSortClass(maxSize);
			
			for(int i=0; i<maxSize; i++){
				long n = (int) (java.lang.Math.random()*199);
				quick.insert(n);
			}
			
			quick.display();
			
			quick.quickSort();
			
			quick.display();
			
		}
	}
}
