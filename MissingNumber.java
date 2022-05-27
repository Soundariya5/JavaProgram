package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		Set<Integer> unique=new TreeSet<Integer>();
	int[] num= {1,2,3,4,5,6,6,9,7};
	for (Integer val : num) {
		unique.add(val);
	}
	List<Integer> missing=new ArrayList<Integer>(unique);
	for( int i=0;i<missing.size();i++) {
		if(missing.get(i)+1!=missing.get(i+1)) {
			System.out.println(missing.get(i)+1);
			break;
		}
	}
	
	}
}