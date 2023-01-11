package Exercise_01;

import java.util.Arrays;

public class Question_8 {

	public static void main(String[] args) {
		int[] number = {20, 30, 40};
		System.out.println("Original Array: "+Arrays.toString(number)); 
//		int x = number[0];
//		number[0] = number[number.length-1];
//		number[number.length-1] = x;
		int x = number[number.length-1];
		number[0] =x;
		for(int i=0; i<number.length-2; i++) {
			number[i]=number[number.length+1];
			System.out.println(number[i]); 
		}
		

	}

}
