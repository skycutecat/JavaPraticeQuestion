package strpra;

import java.io.*;
import java.util.*;

public class Strpra {
	
	/*�E����ޭ��ձM�ΡA�Фť~�����L�H
	 *�D��0:
	 * �N�@�Ӧr��@�H�U�B�z
	 * 1. �N",""."��������
	 * 2. ���ά�WORD��,�N�y�l�˸m
	 * 3. �C�L�X�����Ʀr���Ψ�X�{����
	 * */	
	
	public static void execute(String stInp) {
		if (stInp==null)
			return;
		String[] word = stInp.replace(",", " ").replace(".", " ").split(" ");
		ArrayList<String> arrWord = new ArrayList<String>();
		HashMap hm = new HashMap();
		for (String st:word) {
			if (st!=null && st.length()>0) {
				arrWord.add(0,st);
				if (!hm.containsKey(st)) {
					hm.put(st, st);					
				}
			}
		}
		System.out.println("Reversed String=");
		for (String st:arrWord) {
			System.out.print(st+" ");
		}		
		System.out.println();
		System.out.println();
		System.out.println("All Words=");
		for (Object key:hm.keySet()) {
			System.out.print(key+" ");
		}		
	}
	/* You can test your program here*/
	public static void main(String[] args) {
		Strpra.execute("I, Jimmy, saw a saw saw a saw");
	}
	
}
