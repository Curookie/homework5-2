package homework;

import java.util.Scanner;

public class IsoscelesTriangleStars {
	
	Scanner s = new Scanner(System.in);
	
	public void IsoTriangle() {
		
		String input;
		int height;
		
		while(true) {
			System.out.println("============================");
			System.out.print("이등변삼각형 높이입력 : ");
			input=s.nextLine();
			System.out.println();
			if(!input.matches("^[0-9]+$")) { System.out.println("제대로 입력해주세요."); continue; }
			height=Integer.parseInt(input);
			
			for(int i=0;i<height;i++) {
				for(int j=0;j<height*2-1;j++) {
					if(j+1>height+i) break;
					if(j+1>=height-i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}System.out.println();
			}
			break;
		}
	}
	
	
	public void Diamond() {
		
		String input;
		int size;
		int margin=5;
		
		while(true) {
			System.out.println("============================");
			System.out.print("다이아몬드의 크기입력 : ");
			input=s.nextLine();
			System.out.println();
			if(!input.matches("^[0-9]+$")) { System.out.println("제대로 입력해주세요."); continue; }
			size=Integer.parseInt(input);
			
			int a=1; // i가 size크기니까 부호를 -로바꿨으니 i의 절대값의 두배 size*2만큼 더해준다.
			int b=1; // 마찬가지로 i가 size크기인데 부호바꿨으니 size*2크기만큼 빼주기 위한 스위칭 변수.
			int c=1; // 이 녀석은 부호를 바꿔준다.
			
			for(int i=1;i<size*2;i++) {
				for(int j=1;j<margin+size*2;j++) {
					if(i==size+1) {  a=3; b=-1; c=-1; }
					if(j>=margin+size*a+i*c) break;
					if(j>margin+size*b-i*c) {
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
