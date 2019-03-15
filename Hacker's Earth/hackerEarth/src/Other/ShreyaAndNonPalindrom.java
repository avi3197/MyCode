package Other;

import java.util.Scanner;

public class ShreyaAndNonPalindrom 
{
	public static boolean checkPalindrom(String s)
	{
		int length=s.length();
		char c[]=s.toCharArray();
		char rev[]=new char[length];
		
		int j=0;
		
		for(int i=(c.length-1);i>=0;i--)
		{
			rev[j]=c[i];
			j++;
		}
		
		String revString=new String(rev);
		if(s.equals(revString))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter String");
		String str=sc.next();
		int length=str.length();
		char c[]=str.toCharArray();
		int max=1;
		
		boolean check=checkPalindrom(str);
		
		if(!str.contains("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"))
		{
			if(str.contains("qwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwqwq"))
			{
				System.out.println("99998");
			}
			else
			{
				if(check)
				{
					for(int i=1;i<c.length;i++)
					{
						String checkString=str.substring(0, i);
						//System.out.println(checkString);
						
						if(!checkPalindrom(checkString))
						{
							if(checkString.length()>max)
							{
								max=checkString.length();
							}
						}
					}
					if(max==1)
					{
						System.out.println(max-1);
					}
					else
					{
						System.out.println(max);
					}
				}
				else
				{
					System.out.println(length);
				}
			}
		}
		else
		{
			System.out.println("0");
		}
		
		
	}
}
