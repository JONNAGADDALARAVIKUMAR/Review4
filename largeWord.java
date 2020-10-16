package review4_1;


	import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

	public class largeWord{

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a String");
			String str = scan.nextLine();
			String large="";
			String small =str;
			int num;
			
			
			String strArr[]=str.split(" ");
			int length[] = new int[strArr.length];
			
			for(int i=0;i<strArr.length;i++)
			{
				num=strArr[i].length();
				length[i]=num;
				if(strArr[i].length() > large.length() )
				{
					large = strArr[i];
				}
				if(strArr[i].length() < small.length() )
				{
					small = strArr[i];
				}
				
			}
			Arrays.sort(length);
			//Arrays.sort(strArr);
			
			
			int index=strArr.length-1;
			System.out.println("Smallest word : "+small+" : "+length[0]+"\nLargest word : "+large+" : "+length[index]);
			
			HashMap <Character, Integer> map = new HashMap<>();
			
		      for (int i = large.length() - 1; i >= 0; i--) 
		      {
		         if (map.containsKey(large.charAt(i))) 
		         {
		            int count = map.get(large.charAt(i));
		            
		            map.put(large.charAt(i), ++count);
		            
		         } 
		         else 
		         {
		            map.put(large.charAt(i),1);
		         }
		      }
		      
		      Iterator iterator = map.entrySet().iterator();
		      
		      System.out.println("Occurencies of charectars in word : "+large);
		      
		        while (iterator.hasNext()) 
		        {
		          Map.Entry ch = (Map.Entry) iterator.next();
		          
		          System.out.println(ch.getKey() + " : " + ch.getValue());
		        } 
		}

	}


