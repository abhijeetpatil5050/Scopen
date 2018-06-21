package com.collectionT;

public class AskiiCheck {
	
	public static void main(String[] args) {
		
		String st = "09_AZ_az";
		char[] charray=st.toCharArray();
		
		for (char ch:charray)
		{
			System.out.println((int)ch);
		}
		Integer value=0;
		String str = value.toBinaryString(10);
		System.out.println("String format:"+str);
		System.out.println("Integer format:"+Integer.parseInt(str));
		
	}

}
