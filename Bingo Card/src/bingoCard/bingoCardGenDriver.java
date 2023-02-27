package bingoCard;

import java.util.Scanner;

public class bingoCardGenDriver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Integer numOfBingoCard;
		BingoCard[] bingoCard;
		
		do {
			System.out.print("Please input number of BINGO Cards: ");
			numOfBingoCard = input.nextInt();
			
			if(isValidNum(numOfBingoCard).equals(false)) {
				System.out.println("Invalid value. ");
			}else {
				bingoCard = new BingoCard[numOfBingoCard];				
				for(Integer count = 0 ; count < numOfBingoCard ; count++) {
					bingoCard[count] = new BingoCard().generateBingoCard().displayBingoCard();
					System.out.println();
				}
			}			
		} while(isValidNum(numOfBingoCard).equals(false));
		
		input.close();
	}
	
	public static Boolean isValidNum(Integer num) {
		if(num <= 0) return false;
		else return true;
	}
	
}
