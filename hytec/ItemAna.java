package hytec;

import java.util.HashMap;

public class ItemAna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap total=new HashMap<String,Integer>();
		HashMap single=new HashMap<String,Integer>();
		
		total.put("A", 100);
		total.put("B", 250);
		single.put("A", 10);
		single.put("B", 5);
		for(Object o : total.keySet()){

			
			System.out.println((int)total.get(o)/(int)single.get(o));
		}
		
		
	}

}
