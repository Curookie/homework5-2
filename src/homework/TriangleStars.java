package homework;

import java.util.Scanner;

public class TriangleStars {

	public TriangleStars() {
		
		Scanner s = new Scanner(System.in);
		String input;
		String[] str = new String[2];
		int lpad;
		int height;
		
		while(true) {
			System.out.println("=========================");
			System.out.print("직각삼각형의 왼쪽여백과 높이입력 ex)10 5 : ");
			input=s.nextLine();
			if(!input.matches("^[0-9]+[ ]{1}[0-9]+$")) { System.out.println("'ex)10 5'[왼쪽여백][공백][높이]이렇게 입력해주세요."); continue; }
			str=input.split(" ");
			lpad=Integer.parseInt(str[0]);
			height=Integer.parseInt(str[1]);
			
			for(int i=0;i<height;i++) {
				for(int j=0;j<lpad+height;j++) {
					if(j+1>=lpad+height-i) {
						System.out.print("*");	
					} else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			break;
		}
	}
}
