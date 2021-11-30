package CatExam;
import java.util.*;
import java.lang.*;
import java.io.*;
public class IntToBinary {
	public static int getBinary(int number)
	{
		int integer=0;
		int cnt=0;
		while(number!=0){
			int rem=number % 2;
			double c=Math.pow(10, cnt);
			integer+=rem*c;
			number=number/2;	
			cnt++;
		}
		
		return integer;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Take a Number from User:");
		int number = in.nextInt();
		int result = getBinary(number);
		System.out.print(result);
	}
}
