/**
 * Hangman game were the player has 5 chances to get the word from the 200 words in the game. 
 * 
 * Elizabeth Dunaway 
 * Hangman Project 
 * spring/2020 
 */



package hangman;

public class hangman2 {
	package hangman;

	import java.io.File;
	import java.util.Dictionary;
	import java.util.Random;
	import java.util.Scanner;

	public class Hangman {

		public int wins;
		private int losses; 
		private String currentWord;
		private Dictionary dictionary; 
		/**
		 * the integers for hangman 
		 * @return
		 */
		
		public int getWins() {
			return wins;
		}
		public void setWins(int wins) {
			this.wins = wins;
		}
		public int getLosses() {
			return losses;
		}
		public void setLosses(int losses) {
			this.losses = losses;
		}
		public String getCurrentWord() {
			return currentWord;
		}
		public void setCurrentWord(String currentWord) {
			this.currentWord = currentWord;
		}
		public Dictionary getDictionary() {
			return dictionary;
		}
		public void setDictionary(Dictionary dictionary) {
			this.dictionary = dictionary;
		}
		
		/**
		 * the getter and setters for the integers above 
		 */
		
		
		public Hangman() {
			wins=0;
			losses=0;
			currentWorld="";
		}//close hangman 
		private void loadWL() {
			Scanner inFile= new Scanner(new File("WL.txt"));
		}//close loadWL
		private void writeWL() {
			
		}// writeWL close 
		public void playGame() { 
			Random rand= new Random();
			currentWord=dictionary[rand.nextInt(dictionary.length)];
			wordtoFind= nextWordToFind();
			File wordToFind;
			wordFound= new char[wordToFind.length()];
			for(int i=0; i<wordFound.length; i++) {
				wordFound(i)='_';
				
			}
			
			
		}//playGame close 
		private Object nextWordToFind() {
			// TODO Auto-generated method stub
			return null;
		}
		
		/**
		 * the constructors for hangman 
		 * I'm sorry this is where I'm having trouble 
		 */
	}//close application 
