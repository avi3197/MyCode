package Other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayInsert 
{
	static Scanner in = new Scanner(System.in);
	static int[] a = new int[10009];
	static int[] x = new int[3]; 
	static void intilize()
	{
	for (int i = 0; i < 12; i++)
	a[i] = 0;
	}
	public static void main(String[] args) throws Exception 
	{
	intilize();
	long n , q;
	n = in.nextLong();
	q = in.nextLong();

	for (int i = 0; i < n; i++)
	{
	a[i] = in.nextInt();
	}

	while (q!=0)
	{
	q--;
	x[0] = in.nextInt();
	x[1] = in.nextInt();
	x[2] = in.nextInt();

	if (x[0] == 1)
	{
	a[x[1]] = x[2];
	}
	else
	{
	long sum = 0;
	for (int i = x[1]; i <= x[2]; i++)
	sum += a[i];

	System.out.println(sum);
	}
	}

	}
}
