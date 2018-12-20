import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveCollectionDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(9);
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		//Collections.copy(list2, list);
		
		for(Integer i: list){
			set.add(i);
		}
		
		Collections.sort(list);
		
		System.out.println(set.toString());
		System.out.println(list.toString());
		

	}

}
