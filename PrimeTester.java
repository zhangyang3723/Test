import java.util.Scanner;
class PrimeTester {
	boolean testPrime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		input.close();

		PrimeTester test = new PrimeTester();
		
		if(test.testPrime(number)==true){
			System.out.println(number+" is a prime.");
		}
		else{
			System.out.println(number+" is not a prime.");
		}
	}
}
