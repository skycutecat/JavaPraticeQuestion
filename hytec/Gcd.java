package hytec;

import java.util.*;

public class Gcd {

	/* two number gcd */
	static int gcd(int m,int n){
		int result=1;
		while((m%n)!=0){
			result=n;
			n=m%n;
			m=result;
		}
		result=n;
		return result;
	}
	
	static int Rgcd(int m,int n){
		if((m%n)==0){
			return n;
		}else{
			return Rgcd(n,m%n);
		}
	}
	static int mulGcd(int []tmparr){
		int result=1;
		for(int i=0;i<tmparr.length-1;i++){
			tmparr[i+1]=Rgcd(tmparr[i],tmparr[i+1]);
		}
		return tmparr[tmparr.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(11,121));
		System.out.println(gcd(126,19));
		int[] gcnum=new int[] {150,50};
		System.out.println(mulGcd(gcnum));
		
		
	}
	


}
