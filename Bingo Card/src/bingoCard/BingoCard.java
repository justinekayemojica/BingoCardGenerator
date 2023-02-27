package bingoCard;

import java.util.Random;

public class BingoCard {

	Random randomizer = new Random();
	Integer bingoNumbers[][] = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0} , {0,0,0,0,0}, {0,0,0,0,0}};
	Integer number;

	public BingoCard generateBingoCard() {

		for(int rowCount = 0 ; rowCount < bingoNumbers.length ; rowCount++ ) {
			for(int columnCount = 0 ; columnCount < bingoNumbers[rowCount].length ; columnCount++) {
				if(columnCount == 0) {
					do {
						number = randomizer.nextInt(1,15);
					} while (isUniqueVal(number).equals(false));
					bingoNumbers[rowCount][0] = number;
				}
				if(columnCount == 1) {
					do {
						number = randomizer.nextInt(16,30);
					} while (isUniqueVal(number).equals(false));
					bingoNumbers[rowCount][1] = number;
				}
				if(columnCount == 2) {
					do {
						number = randomizer.nextInt(31,45);
					} while (isUniqueVal(number).equals(false));
					bingoNumbers[rowCount][2] = number;
				}
				if(columnCount == 3) {
					do {
						number = randomizer.nextInt(46,60);						
					} while (isUniqueVal(number).equals(false));
					bingoNumbers[rowCount][3] = number;
				}
				if(columnCount == 4) {
					do {
						number = randomizer.nextInt(61,75);						
					} while (isUniqueVal(number).equals(false));
					bingoNumbers[rowCount][4] = number;
				}
			}
		}
		return this;
	}


	public BingoCard displayBingoCard() {
		for(int rowCount = 0 ; rowCount < bingoNumbers.length ; rowCount++ ) {
			if(rowCount == 0 ) {
				System.out.println("B\tI\tN\tG\tO");
			}
			if(rowCount == 2) {
				System.out.print(bingoNumbers[rowCount][0]);
				System.out.print("\t" + bingoNumbers[rowCount][1]);
				System.out.print("\tFREE");
				System.out.print("\t" + bingoNumbers[rowCount][3]);
				System.out.print("\t" + bingoNumbers[rowCount][4]);
				System.out.println();
				
			} else {
				System.out.print(bingoNumbers[rowCount][0]);
				System.out.print("\t" + bingoNumbers[rowCount][1]);
				System.out.print("\t" + bingoNumbers[rowCount][2]);
				System.out.print("\t" + bingoNumbers[rowCount][3]);
				System.out.print("\t" + bingoNumbers[rowCount][4]);
				System.out.println();
			}
		}
		return this;
	}

	public Boolean isUniqueVal(Integer value) {
		Boolean isUniqueVal = true;
		for(int rowCount = 0 ; rowCount < bingoNumbers.length ; rowCount++) {
			for(int columnCount = 0 ; columnCount < bingoNumbers[rowCount].length ; columnCount++) {
				if(bingoNumbers[rowCount][columnCount].equals(value)) {
					isUniqueVal = false;					
				}
			}
		}
		return isUniqueVal;
	}

}
