
public class Sorting {

	public static void main(String[] args) {// TODO Auto-generated method stub
		int[] arr = {5,8,4,3,1};
		
		for(int i=0; i< arr.length; i++){
			
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
	
	

}
