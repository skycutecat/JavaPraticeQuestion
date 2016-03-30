package hytec;
import java.io.*;
import java.util.*;

public class IOusing {

	public static void main(String[] args) throws IOException {

		
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Input");
//		String tmp=scan.next().toString();
//		System.out.println(tmp);
//		
//		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
//		String text=buf.readLine();
//		System.out.println(text);
		
		
//		String readFile="tmp.txt";
//		BufferedReader br= new BufferedReader(new FileReader(readFile));
//		StringBuilder sb=new StringBuilder();
//		
//		String line=br.readLine();
//		while(line !=null){
//			sb.append(line);
//			sb.append("\n");
//			line=br.readLine();
//		}
//		
//		String tmp=sb.toString();
//		System.out.println(tmp);
		StringBuilder outstr=new StringBuilder();
		outstr.append("xyz");
		outstr.deleteCharAt(outstr.length() - 1);
		System.out.print(outstr);
		
		
	}

}
