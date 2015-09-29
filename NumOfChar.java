import java.util.Scanner;

public class NumOfChar {
  void count(String a, char b){
		int count = 0;
		char[] c = a.toCharArray();
		for(int i=0;i<c.length;i++){
			if (c[i]==b){
				count++;
			}
		}
		System.out.println(a+" has "+count+" '"+b+"' .");
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a String and a char");
		String text = input.next();
		String s = input.next();
		input.close();
		char[] v = s.toCharArray();
		char n = v[0];
		NumOfChar a = new NumOfChar();
		a.count(text,n);

	}

}
