//Kaitlin MacNeill
//06/09/2016
//GC- BOOTCAMP
//LAB4


import java.util.Scanner;

public class FactNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("FACTORIALS.SMACTORIALS.");
		
		
		String cont="y";
		while (cont.equalsIgnoreCase("y")){
			System.out.println("Please enter an integer from 1 to 10.");
			int initial=input.nextInt();
			long fact=1;
				for (int i = 1 ; i <=initial; i++){
					fact = fact*i;
				}
			System.out.println("The factorial is " + fact + ".");
			System.out.println("Would you like to continue? (y/n)");
			cont= input.next();
		}
		
		input.close();
	}

	}
