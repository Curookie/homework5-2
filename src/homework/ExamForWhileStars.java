package homework;

import java.util.Scanner;

public class ExamForWhileStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String input="";
		int menu=0;
		
		while(menu!=5) {
			System.out.println("======================");
			System.out.println("   반복문 연습하기2   ");
			System.out.println("**********************");
			System.out.println("1. 정사각형 별찍기");
			System.out.println("2. 직각삼각형 별찍기");
			System.out.println("3. 이등변삼각형 별찍기");
			System.out.println("4. 다이아몬드 별찍기");
			System.out.println("5. 종료하기");
			System.out.print("원하는 메뉴는 >> ");
			input = s.nextLine(); 
			if(!input.matches("^[1-5]{1}$")) { System.out.println("\n제대로 입력해주세요."); continue; } 
			menu=Integer.parseInt(input);
			switch (menu) {
			case 1: 
				new RectagleStars();
				break;		
			case 2:
				new TriangleStars();
				break;	
			case 3:
				new IsoscelesTriangleStars().IsoTriangle();
				break;	
			case 4:
				new IsoscelesTriangleStars().Diamond();
				break;	
			}
		}		
	}
}
