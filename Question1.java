package review4;

import java.util.HashMap;

public class Question1 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
		int num = 44514621;
		int four=0,five=0,one=0,six=0,two=0;
		String str =Integer.toString(num);
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == '1')
			{
				one++;
			}
			else if(ch == '2')
			{
				two++;
			}
			else if(ch == '4')
			{
				four++;
			}
			else if(ch == '5')
			{
				five++;
			}
			else if(ch == '6')
			{
				six++;
			}
		}
		System.out.println("==============================\n\nDigit             Frequency\n\n=============================");
		System.out.println("1\t\t\t"+one);
		System.out.println("2\t\t\t"+two);

		System.out.println("4\t\t\t"+four);
		System.out.println("5\t\t\t"+five);
		System.out.println("6\t\t\t"+six);

	}

}
