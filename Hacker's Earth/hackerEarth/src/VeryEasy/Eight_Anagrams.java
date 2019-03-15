package VeryEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Eight_Anagrams 
{
	public static void main(String[] args) 
	{
		Scanner scr=new Scanner(System.in);
		int t=scr.nextInt();
		for(int k=0;k<t;k++){
		int cnt=0;
		String s1=scr.next();
		String s2=scr.next();
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		int l1 = a.length,l2 = b.length;
		for(int i=0;i<l1;i++){
		for(int j=0;j<l2;j++){
		if(a[i]==b[j]){
		++cnt;
		b[j]='0';
		break;
		}
		}
		}
		System.out.println(l1 + l2 - (2*cnt));
		}
		
		
	}
}
