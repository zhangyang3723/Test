import java.util.Scanner;
import java.util.ArrayList;

public class MaxNum {
	
	void seleMax(int[] a){
		int max= a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a array, press Control+D to finish.");
        ArrayList<Integer> arrList = new ArrayList<>();        
        while(input.hasNextInt()) {
        	arrList.add(input.nextInt());
        }
        int[] arr = new int[arrList.size()];
        for (int i=0;i<arrList.size();i++){
        	arr[i]=arrList.get(i);
        }
        input.close();
        
        
		
		MaxNum test = new MaxNum();
		
		test.seleMax(arr);
		//int[] a = {12,34,2,1,67};
		//System.out.println(test.seleMax(numbers));
		

	}

}
