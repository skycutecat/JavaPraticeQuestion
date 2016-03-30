package hytec;

import java.util.Arrays;
import java.util.*;

public class triPre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer []leng={6,4,4,2,4};
		Arrays.sort(leng,Collections.reverseOrder());
		int result=0;
		for(int i=0;i<leng.length-2;i++){
			int total=leng[i]+leng[i+1]+leng[i+2];
			int max=Math.max(leng[i], Math.max(leng[i+1], leng[i+2]));
			int relen=total-max;
			if(relen>max){
				if(total>result){
					result=total;
					System.out.println("Max length "+ result);
					System.out.println(leng[i]+" "+leng[i+1]+" "+leng[i+2]);
				}
				
			}
		}
		
	}

}
