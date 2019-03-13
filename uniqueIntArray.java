/* * * * * * * * * *
 *                 *
 *     13BDev      *
 *    Array of     *
 * unique integers *
 *                 *
 * * * * * * * * * */



import java.util.Random;



public class uniqueIntArray {

	public static void main(String[] args) {
		


		int howManyNumbers = 20;								// Enter how many unique numbers you would like to generate
		int randomMax = 50;										// Random numbers generated from 0 to this value

		int i, j;
		Boolean passed = false;

		int[] uniqueArray = new int[howManyNumbers];
		Random rand = new Random();
		


		if (randomMax < howManyNumbers){						// Random number generator possibilities cannot be less than array size, or infinite loop will occur
			randomMax = howManyNumbers;
		}



		uniqueArray[0] = rand.nextInt(randomMax);

		for (i=1; i<(uniqueArray.length); i++) {
			passed = false;

			while (passed == false) {
				passed = true;
				uniqueArray[i] = rand.nextInt(randomMax);		// Temporarily chooses a possible random number for current position in array

				for (j=0; j<i; j++) {							// Loop through the unique values already chosen up until the current iteration, and check against current iteration's possible value to prevent duplicates
					if ( uniqueArray[i] == uniqueArray[j] ) {	
						passed = false;
						break;
					}
				}
			}
		}



		for (i=0; i<uniqueArray.length; i++) {					// Print our list to console
			System.out.println(uniqueArray[i]);
		}



	}
}
