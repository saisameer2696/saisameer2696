package test1;
import java.util.*;
public class Stringrev {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   System.out.println("Input String");
	String s=sc.nextLine();
    System.out.println(Stringrev.reverseWord(s));  
       
    }  
}  
  