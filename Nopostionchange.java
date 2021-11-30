package CatExam;

public class Nopostionchange {
public static void main(String args[]) {


String string1= "ramyathanujakodakandla";
int count= 0;

StringBuffer string2 = new StringBuffer(string1);

string2 = string2.reverse();

for(int i=0; i< string1.length(); i++)
{
if(string1.charAt(i)==string2.charAt(i))
{
count++;
}
}
System.out.println("Total fixed Characters in string : "+count);
}
}
//r a m y a t h a n u j a k o d a k a n d l a
//a l d n a k a d o k a j u n a h t a y m a r