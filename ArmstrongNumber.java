package week1.day2.Assignments;

public class ArmstrongNumber {
	
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153
	 * output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a While loop, type 'while' followed by: ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 */   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=153;
		int calculated=0,original,remainder;
		
		original=input;
		
		while(input>0)
		{
			
			remainder=input%10;
			input=input/10;
			calculated= calculated+(remainder*remainder*remainder);
			
		
			
		}
		if(original==calculated)
		{
			System.out.print("Given number Armstrong number: " + original);
		}
		else
		{
			System.out.print("Given number is not an Armstrong number: " + original);
		}
		
		
		
		/*int number=153;
		int quotient=0, remainder=0,armstrongnum=0;
		
		while(number!=0)
		{
			quotient=number/10;
			remainder=number%10;
			int calculated =remainder*remainder*remainder;
			
			//armstrongnumber= armstrongnumber+calculated;
			number=quotient;*/
		
		//System.out.println(armstrongnum);

	}

}
