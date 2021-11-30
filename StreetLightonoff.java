package CatExam;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class StreetLightonoff {
public static int[] streetLight(int[] currentState, int days) {
	
	
int[] answer = new int[100];
// write code here
int count=0,array,a,l;
int list[]= {0,0,0,0,0,0,0,0,0,0};

for(a=0;a<11;a++);
{
	list[1]=0;
	for(l=0;l<12;l++);{
		if(list[a]==list[l])
			
	}
	
}


return answer;
}
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int currentState_size = in.nextInt();
int currentState[] = new int[currentState_size];
for(int idx = 0; idx < currentState_size; idx++)
{
currentState[idx] = in.nextInt();
}
int days = in.nextInt();
int[] result = streetLight(currentState, days);
for(int idx = 0; idx < result.length - 1; idx++)
{
System.out.print(result[idx] + " ");
}
System.out.print(result[result.length- 1]);											
}
}
