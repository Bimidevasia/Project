import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter string");
		String num=reader.next();
	
		String rev="";
		
		int leng=num.length();
		String orgnum=num;
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev + num.charAt(i);
			
		}
	
		if(orgnum.equals(rev))
		
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
		
		

	}

}
