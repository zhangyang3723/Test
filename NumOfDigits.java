import java.util.Scanner;

/**
 * 
 */

/**
 * @author Amy
 *
 */
public class NumOfDigits {

	/**
	 * @param args
	 */
	void count(int a){
		char[] c = String.valueOf(a).toCharArray();
		System.out.println(a+" has "+ c.length+ " digit(s).");
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		input.close();
		
		NumOfDigits a = new NumOfDigits();
		a.count(number);
		
	}

}
