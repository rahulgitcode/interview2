
public class ShellSortClass{
	private long[] array;
	private int nElems;
	
	public ShellSortClass(int max){
		array = new long[max];
		nElems = 0;
	}
	
	public void insert(long element){
		array[nElems] = element;
		nElems++;
	}
	
	public void display(){
		for(int i =0; i< nElems; i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
	}
	
	public void shellSort(){
		int inner , outer;
		long temp;
		
		int h=1;
		while(h < nElems/3){
			h = h*3+1;
		}
		
		while(h>0){
			for(outer=h; outer<nElems ; outer++){
				temp = array[outer];
				inner = outer;
				
				while(inner > h-1 && array[inner-h]>=temp){
					array[inner] = array[inner-h];
					inner-=h;
				}
				array[inner] = temp;
			}
			h = (h-1)/3;
		}
	}
	
	static class shellSortApp{
		public static void main(String[] args){
			
			int maxSize = 10;
			System.out.println("Hello");
			ShellSortClass shell;
			shell = new ShellSortClass(maxSize);
			
			for(int i=0; i<maxSize; i++){
				long n = (int) (java.lang.Math.random()*99);
				shell.insert(n);
			}
			
			shell.display();			
			shell.shellSort();
			shell.display();
			
		}
	}
}
