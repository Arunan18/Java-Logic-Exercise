package Exercise_01;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of character- ");
		n = sc.nextInt();
		String[] array = new String[n];
		
		System.out.println("Enter your word character- ");
		String Originalword = "";
		Scanner sc1= new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			array[i] = sc1.nextLine();;
			 Originalword = Originalword + array[i] ;
		}
		System.out.println("Original word :- " + Originalword);

		String ReverseWord = "";
		 for (int i = 0; i < Originalword.length(); i++) {
			  ReverseWord = Originalword.charAt(i) + ReverseWord;
			}
		 System.out.println("Reverse Word :- "+ ReverseWord );
	}

}
