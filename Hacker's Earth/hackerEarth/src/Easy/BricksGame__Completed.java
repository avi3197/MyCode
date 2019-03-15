package Easy;

/*Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing their work. They decided , they end up with a fun challenge who will put the last brick.

They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.

There are only N bricks, you need to help find the challenge result to find who put the last brick.

Input:

First line contains an integer N.

Output:

Output "Patlu" (without the quotes) if Patlu puts the last bricks ,"Motu"(without the quotes) otherwise.

Constraints:

1 ≤ N ≤ 10000

SAMPLE INPUT 
13
SAMPLE OUTPUT 
Motu
Explanation
Sample Explanation:

13 bricks are there :

Patlu Motu

1 2

2 4

3 1 ( Only 1 remains)

Hence, Motu puts the last one.*/



import java.util.Scanner;

public class BricksGame__Completed 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter noo");
		int no=sc.nextInt();
		int patlu=1, motu=2;
		int count=patlu+motu;
		boolean val = false;
		
		for(int i=1;i<=no;i++)
		{
			if(count<no)
			{
				patlu=patlu+1;
				count=count+patlu;
				if(count<no)
				{
					motu=patlu*2;
					count=count+motu;
				}
				else
				{
					val=true;
					System.out.println("patlu");
					break;
				}
			}
		}
		if(count>=no && val!=true)
		{
			System.out.println("motu");
		}
		
		
	}
}
