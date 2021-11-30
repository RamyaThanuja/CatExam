package CatExam;
import java.io.*;
import java.lang.*;
import java.util.*;
public class BillDiscount {
private static int Discount(int Amount) {
int sum=0;
while(Amount>0)
{
int d=Amount%10;
int s=d%2;
if(s!=0) {
sum+=d;
}
Amount=Amount/10;
}
return sum;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int Amount = sc.nextInt();
int result=Discount(Amount);
System.out.print(result);
}
}