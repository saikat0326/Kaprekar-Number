import java.util.*;
public class KaprenKarNumber {
		
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		float num = in.nextFloat();
		
		float x =  Math.round((Float.toString(num*num).length()-2)/2.0f);
		
		int r = (int) (num*num % Math.pow(10,x));
		int q = (int) (num*num / Math.pow(10,x));
		
		if(num==(r+q)) 
			System.out.println("Yes "+num+" is a KAPREKAR Number");
		else
			System.out.println("No "+num+" is not a KAPREKAR Number");

	}

}