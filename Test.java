import java.util.*;
public class Test{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
int count=0;
int l=str.length();
char[] a;
 a=new char[l];
int cons=0;
 for(int i=0;i<l;i++)
{
 a[i]=str.charAt(i);
if(a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'||a[i]=='i')
{
  count++;
}
else if(a[i]==' ')
{
 
}
else
{
  cons++;
}
System.out.print(a[i]);
}
System.out.println("the given String contains"+count+"vowels and"+cons+"consonents");
}
}