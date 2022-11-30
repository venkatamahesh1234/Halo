import java.util.Scanner;
class AnagramEx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String Word is : ");
		String s1=sc.next();
		System.out.println("Enter Second String Word is : ");
		String s2=sc.next();
		boolean flag=true;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch1=s1.charAt();
			int count=0;
			for(int j=0;j<s2.length()-1;j++)
			{
				char ch2=s2.charAt();
				if(ch1==ch2)
				{
					count++;
					break;
				}
				if(count==0)
				{
					flag=false;
					System.out.println("Not Anagram");
				}
			}
			if(flag)
			{
					System.out.println("Anagram");				
			}
		}
	}
}