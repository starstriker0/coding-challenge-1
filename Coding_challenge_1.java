package Coding_challenge_1;
import java.util.Scanner;

public class Coding_challenge_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Text: ");
		String text = input.nextLine();
//		String text = "Congratulations! Today is your day. You're off to Great Places! You're off and away";
		
		double letterCount = 0;
		double wordCount = 0;
		double sentencecount = 0;
		char temp;

		if(!text.isEmpty())
			wordCount++;

		
		for( int i = 0; i < text.length( ); i++ )
		{
		    temp = text.charAt( i );

		    if(temp != ' ' && temp != '!' && temp != '?' && temp != '.' && temp != '\'')
		        letterCount++;
			else if(temp == ' ') 
				wordCount++;
			else if(temp != '\'')
				sentencecount++;
		}
		double L = (letterCount/wordCount)*100;
		double S = (sentencecount/wordCount)*100;
		double Index = 0.0588 * L - 0.296 * S - 15.8;
		System.out.println("Grade: "+ Math.round(Index));


		
		
		
		
//		output code to debug, please disregard
//		System.out.println("Letters: "+ letterCount);
//		System.out.println("Words: "+ wordCount);
//		System.out.println("sentencecount: "+ sentencecount);
//		System.out.println("Lp100: "+ L);
//		System.out.println("Sp100: "+ S);
//		System.out.println("Grade: "+ Math.round(Index));

		
		
	}

}
