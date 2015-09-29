import java.util.Scanner;

public class SelectEvenNum {
	void displayEvenNum(int a){
		for (int i=2;i<=a;i=i+2){
			System.out.println(i+", ");
			
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a number:");
		int number = input.nextInt();
		input.close();
		
		SelectEvenNum test = new SelectEvenNum();
		test.displayEvenNum(number);
	}

}
