package com.java;

public class FindRepeatedChar {

	public static void main(String[] args) {
		String s1 = "apple";
		char repeatChar = repeatCharMethod(s1);
		if(repeatChar != 0)
			System.out.println("First repated char: "+ repeatChar);
		else
			System.out.println("No repition found");

	}
	
	static char repeatCharMethod(String s1)
	{
		char[] cs1 = s1.toCharArray();
		int count = 0;
		for(int i =0; i< cs1.length; i++)
		{
			
			for(int j =0; j< cs1.length;j++)
			{
				if(cs1[i] == cs1[j])
				{
					count++;
				}
			}
			if(count > 1){
				return cs1[i];
			}
			else{
				count = 0;
			}
		}
		return 0;
		
	}

}
