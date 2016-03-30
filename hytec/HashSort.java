package hytec;

import java.util.*;

public class HashSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stInp="1,4 5 3 3 9 5 4 2 2 1 8 11 1 1 1 1 2 2 2 2 2 2 2 2 2 2";
		String[] word = stInp.replace(",", " ").replace(".", " ").split(" ");
		ArrayList<String> arrWord = new ArrayList<String>();
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		
		for (String st:word) {
			System.out.print(st+" ");
			if (st!=null && st.length()>0) {
				if (!hm.containsKey(st)) {
					hm.put(st, 1);					
				}else{
					int tmp=hm.get(st);
					tmp++;
					hm.put(st, tmp);	
				}
			}
		}
		System.out.println();
		for(Object key : hm.keySet()){
			System.out.println( key.toString()+":"+ hm.get(key));
		}
		System.out.println();
		System.out.println();
		   Object[] a = hm.entrySet().toArray();
//		    Arrays.sort(a, new Comparator() {
//		        public int compare(Object o1, Object o2) {
//		            return ((Map.Entry<String, Integer>) o2).getValue().compareTo(
//		                    ((Map.Entry<String, Integer>) o1).getValue());
//		        }
//		    });
//		    
		   
		   
		   Arrays.sort(a, new Comparator(){
			   public int compare(Object o1, Object o2){
				   return ((Map.Entry<String, Integer>)o2).getValue().compareTo(
						   ((Map.Entry<String, Integer>)o1).getValue());
			   }
			   
		   });
		    for (Object e : a) {
		        System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
		                + ((Map.Entry<String, Integer>) e).getValue());
		    }
		
	}

}
