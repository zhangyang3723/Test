import java.util.ArrayList;
import java.util.Scanner;

public class MaxMin {
	void seleMaxMin(int[] a){
		int max= a[0];
		int min= a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>max){
				max=a[i];
			}
		}
		for (int i=1;i<a.length;i++){
			if (a[i]<min){
				min=a[i];
			}
		}
		System.out.println("Max is "+max+" Min is "+min);
		
	}
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a array, press ENTER, then press CONTROL+D to finish.");
        ArrayList<Integer> arrList = new ArrayList<>();        
        while(input.hasNextInt()) {
        	arrList.add(input.nextInt());
        }
        int[] arr = new int[arrList.size()];
        for (int i=0;i<arrList.size();i++){
        	arr[i]=arrList.get(i);
        }
        input.close();
        MaxMin test = new MaxMin();
		test.seleMaxMin(arr);
	}

}
