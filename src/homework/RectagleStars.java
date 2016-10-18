package homework;

import java.util.Scanner;

public class RectagleStars {
	
	public RectagleStars() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		String input;
		int size=0;
		
		while (true) {
			System.out.println("=============================");
			System.out.print("정사각형 크기입력 : ");
			input=s.nextLine();
			if(!input.matches("^[0-9]+$")) { System.out.println("\n제대로 입력해주세요."); continue; }
			size=Integer.parseInt(input);
			
			for(int i=0;i<size/2;i++) {
				for(int j=0;j<size;j++) {
					System.out.print("*");
				}System.out.println();
			}
			break;
		}
	}
}
