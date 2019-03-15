package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicalWord 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int iterations=sc.nextInt();
		
		List<String> finalList=new ArrayList<String>();
		
		for(int ite=1;ite<=iterations;ite++)
		{
			int stringLength=sc.nextInt();
			String string=sc.next();
			
			String finalString="";
			List<Integer> list=new ArrayList<Integer>();
		
			char ch[]=string.toCharArray();
		
			for(int i=0;i<ch.length;i++)
			{
				
				boolean check=Character.isUpperCase(ch[i]);
			
				if(check)//upper case letter
				{
					int ascii=ch[i];
					int finalValue=0;
					int max=0,min = 0;
				
					for(int plus=ascii;plus<=100;plus++)//nearest plus prime find
					{
						int count=0;
						for(int j=1;j<=plus;j++)
						{
							if(plus%j == 0)
							{
								count++;
							}
						}
						if(count == 2)
						{
							max=plus;
							break;
						}
					}
					for(int minus=ascii;minus>=50;minus--)//nearest minus prime find
					{
						int count=0;
						for(int j=1;j<=minus;j++)
						{
							if(minus%j == 0)
							{
								count++;
							}
						}
						if(count == 2)
						{
							min=minus;
							break;
						}
					}
				
				
					int plus_diff=max-ascii;
					int minus_diff=ascii-min;
				
					if(plus_diff == minus_diff)
					{
						finalValue=min;
					}
					else
					{
						if(plus_diff<minus_diff)
						{
							finalValue=max;
						}
						else
						{
							finalValue=min;
						}
					}
				
				//System.out.println(min);
				//System.out.println(ch[i]+" = "+ascii);
				//System.out.println(max);
				//System.out.println("finalValue "+finalValue);
					list.add(finalValue);
				
				}
				else //lower case letter
				{
					int ascii=ch[i];
					//System.out.println(ascii);
					if((ascii < 65))
					{
						list.add(67);
					}
					else if(ascii > 122)
					{
						list.add(113);
					}
					else
					{
					int finalValue=0;
					int max=0,min = 0;
				
					for(int plus=ascii;plus<=150;plus++)//nearest plus prime find
					{
						int count=0;
						for(int j=1;j<=plus;j++)
						{
							if(plus%j == 0)
							{
								count++;
							}
						}
						if(count == 2)
						{
							max=plus;
							break;
						}
					}
					for(int minus=ascii;minus>=50;minus--)//nearest minus prime find
					{
						int count=0;
						for(int j=1;j<=minus;j++)
						{
							if(minus%j == 0)
							{
								count++;
							}
						}
						if(count == 2)
						{
							min=minus;
							break;
						}
					}
				
					//System.out.println(min);
					//System.out.println(ch[i]+" = "+ascii);
					//System.out.println(max);
					
					int plus_diff=max-ascii;
					int minus_diff=ascii-min;
					
					//System.out.println(plus_diff);
					//System.out.println(minus_diff);
				
					if(plus_diff == minus_diff)
					{
						finalValue=min;
					}
					else
					{
						if(plus_diff<minus_diff)
						{
							if(max>122)
							{
								finalValue=min;
							}
							else
							{
								finalValue=max;
							}
						}
						else
						{
							finalValue=min;
						}
					}
				
				
				//System.out.println("finalValue "+finalValue);
					list.add(finalValue);
				}
				}
			
			}
			//System.out.println(list);
			for(int value:list)
			{
				char cha=(char)value;
				finalString=finalString+cha;
			}
			//System.out.println(finalString);
			finalList.add(finalString);
			
		}
		for(String str:finalList)
		{
			System.out.println(str);
		}
	}
}
