package VeryEasy;

import java.util.Scanner;

public class SeatingArrangement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int num;
		for(int i=0; i<cases; i++){
		int seatNo = sc.nextInt();
		int mod = seatNo%12;
		switch(mod){
		case 1: num = (mod==1 && seatNo!=1)?(seatNo+11):12;
		System.out.println(num +" "+ "WS");
		break;
		case 6: num = (mod==6 && seatNo!=6)?(seatNo+1):7;
		System.out.println(num +" "+ "WS");
		break;
		case 7: num = (mod==7 && seatNo!=7)?(seatNo-1):6;
		System.out.println(num +" "+ "WS");
		break;
		case 0: num = (mod==0 && seatNo!=12)?(seatNo-11):1;
		System.out.println(num +" "+ "WS");
		break;
		case 2: num = (mod==2 && seatNo!=2)?(seatNo+9):11;
		System.out.println(num +" "+ "MS");
		break;
		case 5: num = (mod==5 && seatNo!=5)?(seatNo+3):8;
		System.out.println(num +" "+ "MS");
		break;
		case 8: num = (mod==8 && seatNo!=8)?(seatNo-3):5;
		System.out.println(num +" "+ "MS");
		break;
		case 11: num = (mod==11 && seatNo!=11)?(seatNo-9):2;
		System.out.println(num +" "+ "MS");
		break;
		case 3: num = (mod==3 && seatNo!=3)?(seatNo+7):10;
		System.out.println(num +" "+ "AS");
		break;
		case 4: num = (mod==4 && seatNo!=4)?(seatNo+5):9;
		System.out.println(num +" "+ "AS");
		break;
		case 9: num = (mod==9 && seatNo!=9)?(seatNo-5):4;
		System.out.println(num +" "+ "AS");
		break;
		case 10: num = (mod==10 && seatNo!=10)?(seatNo-7):3;
		System.out.println(num +" "+ "AS");
		break;
		}
		}
	}
}
