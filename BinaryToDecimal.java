package CatExam;
import java.io.*;
import java.lang.*;
import java.util.*;
public class BinaryToDecimal {
public static int convertBinaryToDecimal(long number) {
int answer = 0, count = 0;
long remainder;
while (number != 0) {
remainder = number % 10;
number=number/10;
answer += remainder * Math.pow(2, count);
++count;
}
return answer;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Binary Number to convert into integer: ");
int number=sc.nextInt();
int result=convertBinaryToDecimal(number);
System.out.println(result);
}
}