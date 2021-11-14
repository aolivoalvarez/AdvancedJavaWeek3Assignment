/*Alexis Olivo-Alvarez

INEW-2338 2801

14 November 2021

Create a program that transforms a sentence into pig latin */

package pigLatinAssignment;
import java.util.Scanner; //to get user input

public class PigLatin {

	public static void main(String[] args) {
		//variables
		
		Scanner input = new Scanner(System.in); //user input
		
		String sentence = " "; //holds user sentence
		char firstChar = ' '; //temporarily holds first char of each word
		String pigLatin = " "; //holds sentence in pig latin
		String plWord = " "; //temporarily holds the pig latin version of each word
		
		//getting sentence
		
		System.out.print("Please enter your sentence to transform into pig latin: ");
		sentence = input.nextLine();
		
		
		//splits sentence by whitespace into a string array for manipulation
		
		String[] words = sentence.split("\s");
		
		for (String s : words) {
			firstChar = s.charAt(0); //gets the first letter of the word
			plWord = s.substring(1) + firstChar + "ay"; //makes a substring of the word after the first letter and then adds the first character and 'ay' to the end
			pigLatin += plWord + "\s";	//adds the word in pig latin and a whitespace to the pig latin sentence
		}
		
		//prints pig latin sentence
		
		System.out.println("Your sentence in pig latin is: " + pigLatin);

	}

}
