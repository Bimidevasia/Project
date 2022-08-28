import java.util.Scanner;

public class PalindromeNo {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter no");
		int num= reader.nextInt();
		int orgnum=num;
		int rev=0;
		while(num>0)
		{
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		
		if(orgnum==rev)
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
