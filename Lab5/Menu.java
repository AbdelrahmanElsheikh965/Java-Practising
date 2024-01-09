package dictionary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

	public static void mainMenu() {
	
	System.out.println("\nSelect an operation to perform on the dictionary : "
			+ "\n1- Get words starting with a specific character"
			+ "\n2- Insert a group of words"
			+ "\n3- Remove a word"
			+ "\n4- Remove a every word starting with a specific character"
			+ "\n5- Search for a word"
			+ "\n6- Exit");
	
	while(true) {
		
	Scanner sc = new Scanner(System.in);
	int answer = sc.nextInt(); 		
	
	
	switch(answer) {
	
		case 1:
			System.out.print("Enter the target character");
			char c = sc.next().charAt(0);
			ReadData.getWords(c);
			break;
			
		case 2:
			System.out.print("Enter number of words to add"); 
			int noOfWords = sc.nextInt(); 	
			List<String> words = new ArrayList<>(noOfWords);
			
			// Clear the buffer (VIP very important)
			sc.nextLine(); 
			
			int i = 1;
			while(i <= noOfWords) {
				System.out.print("Enter the " + i +" th word first char is uppercase:"); 
				String str = sc.nextLine();
				words.add(str);
				i++;
			}
			
			String[] stringifiedWords = words.toArray(new String[0]);
			InsertData.insert(stringifiedWords);
			ReadData.printDictionary(); 
			break;
			
		case 3:
			System.out.println("Enter the word to be destroyed!");
			sc.nextLine(); 
			String wordToBeRemoved = sc.nextLine();
			RemoveData.removeWord(wordToBeRemoved);
			ReadData.printDictionary(); 
			break;
			
		case 4:
			System.out.print("Enter the target character");
			char rc = sc.next().charAt(0);
			RemoveData.removeKeyValues(rc);
			ReadData.printDictionary(); 
			break;
			
		case 5:
			System.out.print("Enter the word to search for :");
			sc.nextLine(); 
			String needle= sc.nextLine();
			System.out.println("Search Results : " + Arrays.toString(SearchForData.search(needle).toArray()));
			break;
			
		case 6:
			System.exit(0);
			break;
			}			
		}
	}

}
