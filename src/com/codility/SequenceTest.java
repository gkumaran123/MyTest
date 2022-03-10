package com.codility;

public class SequenceTest {
	
	public static void main(String[] args) {	
		String S = "bbbaaabbb";
		System.out.println(numOfLettersToAdd(S));
	}
	
	public static int numOfLettersToAdd(String s)
	{
	if (s.length() < 3)
	return 0;
	int appear = 1;
	int max_appear = 1;
	int num_groups = 1;
	int num_chars = 0;
	char prev = s.charAt(0);

		for (int i = 1; i < s.length(); i++)
		{
			if(s.charAt(i) != prev)
			{
				if (appear > max_appear)
					max_appear = appear;
				num_groups++;
				appear = 1;
			}
			else
				appear++;
			
			prev = s.charAt(i);
		}
		if (appear > max_appear) //if biggest group is the rightmost
			max_appear = appear;
		
		num_chars = s.length() - max_appear;
		return ((num_groups - 1) * max_appear) - num_chars ;
	}

}
