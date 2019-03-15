package Easy;

/*Given two strings of equal length, you have to tell whether they both strings are identical.

Two strings S1 and S2 are said to be identical, if any of the permutation of string S1 is equal to the string S2. See Sample explanation for more details.

Input :

First line, contains an intger 'T' denoting no. of test cases.
Each test consists of a single line, containing two space separated strings S1 and S2 of equal length.
Output:

For each test case, if any of the permutation of string S1 is equal to the string S2 print YES else print NO.
Constraints:

1<= T <=100
1<= |S1| = |S2| <= 10^5
String is made up of lower case letters only.
Note : Use Hashing Concept Only . Try to do it in O(string length) .

SAMPLE INPUT 
3
sumit mitsu
ambuj jumba
abhi hibb
SAMPLE OUTPUT 
YES
YES
NO
Explanation
For first test case,

mitsu can be rearranged to form sumit .

For second test case,

jumba can be rearranged to form ambuj .

For third test case,

hibb can not be arranged to form abhi. */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TwoString__completed 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=null,s2=null;
		int count=0;
		List<String> result=new ArrayList<String>();
		//System.out.println("no of test cases");
		int no=sc.nextInt();
		for(int i=1;i<=no;i++)
		{
			s1=sc.next();
			s2=sc.next();
			int length=s1.length();
			char c[]=s1.toCharArray();
			char d[]=s2.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			//System.out.println(c);
			//System.out.println(d);
			for(int j=0;j<c.length;j++)
			{
				if(c[j]==d[j])
				{
					count++;
				}
			}
			if(count==length)
			{
				result.add("yes");
			}
			else
			{
				result.add("no");
			}
			count=0;
			
		}
		for(String s:result)
		{
			System.out.println(s);
		}
		
		
		
	}
}
