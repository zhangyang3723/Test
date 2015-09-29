import java.util.Scanner;

public class NumOfA {
	
	 void count(String a){
		int count = 0;
		char[] c = a.toCharArray();
		for(int i=0;i<c.length;i++){
			if (c[i]=='a'){
				count++;
			}
		}
		System.out.println(a+" has "+count+" 'a'.");
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a String:");
		String text = input.nextLine();
		input.close();
		
		NumOfA a = new NumOfA();
		a.count(text);
		

	}

}
