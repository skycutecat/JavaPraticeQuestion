package hytec;


import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calPrime(3));
		ArrayList<Integer> Result= new ArrayList<Integer>();
		Result=primeAns(50,100);
		if(Result.size()!=0){
			for (Integer t:Result) {
				System.out.print(t+" ");
			}
		}
		
		
	}
	
	static ArrayList<Integer> primeAns(int m,int n){
		ArrayList<Integer> result=new ArrayList<Integer>();
		int tmp=m;
		while(tmp<=n){
			if(calPrime(tmp)){
				result.add(tmp);
			}
			tmp++;
		}
		return result;
	}
	static boolean calPrime(int m){
	
		boolean pflag=true;
		for(int i=2;i<m;i++){
			int k=m%i;
			if(k==0){
				pflag=false;
				break;
			}
	
		}

		return pflag;
	}
}
