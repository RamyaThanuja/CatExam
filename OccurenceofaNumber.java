package CatExam;
import java.util.Scanner;
public class OccurenceofaNumber {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
OccurenceofaNumber ocn = new OccurenceofaNumber();
System.out.println("Enter a value :");
int inputdata = s.nextInt();
System.out.println("Enter a value to check the repetion: ");
int number = s.nextInt();
int result = ocn.occurenceOfNumber(inputdata,number);
System.out.println(result);
}
public int occurenceOfNumber(int inputdata, int number) {
int answer=0;
int num=0;
while(inputdata>0) {
num = inputdata%10; 
if(num==number) {
answer = answer+1;
}
inputdata=inputdata/10;
}
return answer;
}
}