package ch03;

import java.util.Scanner;

public class Ch03Adv01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogChick = scanner.nextInt();
		int dogChickLeg = scanner.nextInt();
		int dog=0, chick=0;
		int num1Leg=0, num2Leg=0;

		for(;!(dogChick==0 || dogChickLeg==0);) {
			
			if(dogChick > 1000 || dogChickLeg > 4000) {
				System.out.println("INPUT ERROR!");
			}else if(dogChick < 0 || dogChickLeg < 0) {
				System.out.println("INPUT ERROR!");
			}else if(dogChick > dogChickLeg) {
				System.out.println("0");
			}else {
				for( dog=0; dogChick>=dog; dog++) {
					num1Leg = dogChickLeg - dog*4;
					if(num1Leg >= 2) {
						for( chick=0;chick+dog<=dogChick; chick++) {
							num2Leg = num1Leg - chick*2;
							if(chick + dog == dogChick && num2Leg==0) {
								System.out.printf("%d %d ", dog, chick);
							}
						}
					}
				}
			}
			dogChick = scanner.nextInt();
			dogChickLeg = scanner.nextInt();
			
		}
		System.out.println("시스템 종료");
		System.exit(0);
		
	}
}
