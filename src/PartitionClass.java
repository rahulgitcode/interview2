
public class PartitionClass{
	private long[] array;
	private int nElems;
	
	public PartitionClass(int max){
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
	
	public int partitionIt(int left, int right, long pivot){
		int leftPtr = left-1;
		int rightPtr = right + 1;
		
		while(true){
			while(leftPtr < right && array[++leftPtr]< pivot){
				//do nothing
			}
			
			while(rightPtr>left && array[--rightPtr]>pivot){
				//do nothing
			}
			
			if(leftPtr>=rightPtr){
				break;
			}
			else{
				swap(leftPtr,rightPtr);
			}
			
			
		}
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
			
			PartitionClass shell;
			shell = new PartitionClass(maxSize);
			
			for(int i=0; i<maxSize; i++){
				long n = (int) (java.lang.Math.random()*199);
				shell.insert(n);
			}
			
			shell.display();
			
			long pivot = 99;
			System.out.println("Pivot is :"+ pivot);
			
			int size = shell.size();
			
			int partDex = shell.partitionIt(0, size-1, pivot);
			
			System.out.println("Partition is at index: "+ partDex);
			shell.display();
			
		}
	}
}
