package hangman;

import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
import java.util.*;


public class Dictionary {

	private String[] wordList; 
	private int currentCard; 
	private SecureRandom randomNumbers;
	
	/**
	 * the integers for Dictionary 
	 * @return
	 */
	
	public String[] getWordList() {
		return wordList;
	}
	public void setWordList(String[] wordList) {
		this.wordList = wordList;
	}
	public int getCurrentCard() {
		return currentCard;
	}
	public void setCurrentCard(int currentCard) {
		this.currentCard = currentCard;
	}
	public SecureRandom getRandomNumbers() {
		return randomNumbers;
	}
	public void setRandomNumbers(SecureRandom randomNumbers) {
		this.randomNumbers = randomNumbers;
	} 
	/**
	 * the getter and setters for dictionary 
	 * @param fileName
	 */
	public Dictionary(String fileName) {
		this.wordList= new string();
		this.readFile(fileName);
	}//close Dictionary 
	
	private void readFile(String fileName) {
		Scanner inFile= new Scanner(new File("hangman.txt"));
	}//close readFile 
	
	public String chooseWord() {
		Random rand= new Random();
		currentWord=dictionary[rand.nextInt(dictionary.length)];
		
	}//chooseWord 
	
	/**
	 * the constructors for dictonary 
	 * this is where I'm struggling 
	 */
	
	
	
}// close public class 
