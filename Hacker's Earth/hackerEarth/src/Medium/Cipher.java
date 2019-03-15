package Medium;

import java.util.Scanner;

public class Cipher 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter string");
		String string=sc.next();
		//System.out.println("enter ");
		int decodekey=sc.nextInt();
		String finalString="";
		boolean charCheck;
		
		char c[]=string.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			int rem=decodekey%26;
			char ch=c[i];
			
			charCheck=Character.isUpperCase(ch);
			if(charCheck)
			{
				int ascii=ch;
				int fin=ascii+rem;
				if(fin>90)
				{
					finalString=finalString+(char)(63+(fin-89));
				}
				else
				{
					finalString=finalString+(char)fin;
				}
			
			}
			else
			{
				int ascii=ch;

				if(ascii<97 || ascii>122)
				{
					if(ascii>=48 && ascii<=57)
					{
						int intrem=decodekey%10;
						int value=Character.getNumericValue(ch)+intrem;
						if(value>9)
						{
							if(intrem>0)
							{
								finalString=finalString+(char)(47+intrem);
							}
							else
							{
								finalString=finalString+ch;
							}
						}
						else
						{
							finalString=finalString+(char)(ch+intrem);
						}
						
					}
					else
					{
						finalString = finalString+((char)ascii);
						rem=0;
					}
				}
				else
				{	
					int fin=ascii+rem;
					if(fin>122)
					{
						finalString=finalString+(char)(95+(fin-121));
					}
					else
					{
						finalString=finalString+(char)fin;
					}
				}
			}
		}
		System.out.println(finalString);
	}
}
