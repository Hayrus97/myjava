import java.util.Scanner;


public class test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner nani = new Scanner(System.in);
		String s = nani.next();
		int n = s.length();
		int []a=new int[26];
		char b;
		int i;
		String ans="";
		for(i=0;i<n;i++)
		{
			b= Character.toLowerCase(s.toCharArray()[i]);
			if(a[s.toCharArray()[i]-97]==0)
			{
				ans+=b;
				a[b-97]++;
			}
		}
		System.out.println("answer===="+ans);
		// TODO Auto-generated method stub

	}

}
/*
input=====malayalam
answer====maly
*/
