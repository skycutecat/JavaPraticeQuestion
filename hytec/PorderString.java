package hytec;

public class PorderString {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String tmp="abc";
//		p("",tmp);
		combine("abcd", new StringBuffer(), 0);
		
		
	}

	static void p(String prefix,String str){
		int n=str.length();
		if(n==0) {System.out.println(prefix);
			}
		else{
			for(int i=0;i<str.length();i++){
				p(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
			}
		}
		
		
		
			
	}
	
	static void combine(String instr, StringBuffer outstr, int index)
	{
	    for(int i=index;i<instr.length();i++){
	    	outstr.append(instr.charAt(i));
	    	System.out.println(outstr);
	    	combine(instr,outstr,i+1);
	    	outstr.deleteCharAt(outstr.length()-1);
	    	
	    }
	} 
}
