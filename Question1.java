package review4;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
		
		 Scanner scan=new Scanner(System.in);
	        System.out.println("Enter the number");
	        int number=scan.nextInt();
	        int numArr[]=new int[10];
	        int rem;
	        for(int i=0;i<numArr.length;i++){
	            numArr[i]=0;
	        }
	        while(number!=0){
	            rem=number%10;
	            number=number/10;
	            numArr[rem]++;
	        }
	        
	        System.out.println("Sample Output");
	        System.out.println("======================");
	        System.out.println("Data \t Frequency");
	        System.out.println("======================");
	        for(int j=0;j<numArr.length;j++){
	            System.out.println(""+j+"\t "+numArr[j]);
	        }
	                   
	        }		
		
}
