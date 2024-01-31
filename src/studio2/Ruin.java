package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you want to start with?");
		int startAmount = in.nextInt();
		
		System.out.println("What is your chance of winning?");
		double winChance = in.nextDouble();

		System.out.println("How much do you want to multiply your money before you leave?");
		int winLimit = startAmount * in.nextInt();
		System.out.println("This is your winLimit" + winLimit);
		
		
		while(startAmount < winLimit && startAmount > 0) {
			if(Math.random() < winChance) {
				startAmount ++;
			} else {
				startAmount--;
			}
			System.out.println(startAmount);
		
			
		}
		if(startAmount >= winLimit) {
			System.out.println("You win!");
		} else {
			System.out.println("You lost");
		}
		
		
	}

}
