package CatExam;

import java.util.Scanner;

public class SecurityKey {
	static int countRepeatingDigits(int N)
	{
		int res = 0;
		int cnt[] = new int[10];
		while (N > 0)
		{
			int rem = N % 10;
			cnt[rem]++;
			N = N / 10;
			}
		for (int i = 0; i < 10; i++)
		{
			if (cnt[i] > 1)
			{
				res++;
		        }
		    }
		return res;
		}
	public static void main(String[] args)
		{
		int N = 578378923;
		System.out.println(countRepeatingDigits(N));
		}
		}
		 
	 