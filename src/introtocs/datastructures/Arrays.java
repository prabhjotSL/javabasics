package introtocs.datastructures;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// Working with Arrays and ArrayLists
		int[] eveNums = {2,4,6,8,10};
		//System.out.println(eveNums[2]);
		eveNums[2] = 12;
		//System.out.println(eveNums.length);
		
		for(int i=0; i<eveNums.length; i++) {
			//System.out.println(eveNums[i]);
		}
		
		ArrayList<String> bdayList = new ArrayList<String>();
		bdayList.add("XBOX One");
		bdayList.add("FIFA 15");
		bdayList.add("PS4");
		//System.out.println(bdayList.get(1));
		bdayList.set(1, "FIFA 14");
		//System.out.println(bdayList.get(1));
		for(int i=0; i<bdayList.size(); i++) {
			System.out.println(bdayList.get(i));
		}
	}

}
