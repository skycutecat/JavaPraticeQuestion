package varpass;
import java.util.*;

public class varPasByFun {
	
	static void PassByVal(int pint,Integer pInt,String []pStr,int[] pAint,StringBuffer bstr,String ostr ){
		pint=11;
		pInt=new Integer(6);
		pStr[0]="H";
		pAint[0]=2;
		bstr.append("123");
		ostr="321";
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pint=10;
		
		Integer pInt=new  Integer(5);
		String []pStr={"a","b","c"};
		int []pAint={1,2};
		StringBuffer bstr=new StringBuffer("123");
		String ostr="123";
		PassByVal(pint,pInt,pStr,pAint,bstr,ostr);
		System.out.println("Org int:10             , modified :"+pint);
		System.out.println("Org Intger:5           , modified :"+pInt);
		System.out.println("Org int Array [0]:5    , modified :"+pAint[0]);
		System.out.println("Org String Array [0]:a , modified :"+pStr[0]);
		System.out.println("Org StringBuffer:123   , modified :"+bstr);
		System.out.println("Org ostr:123           , modified :"+ostr);
		
	}

}
