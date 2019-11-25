package Strings;

public class WordList {
	
	public static String[] Process(String tex) {
		System.out.println(tex);
		tex = tex.replace("\r\n\t", " ");
		String[] wordList; 
		
		wordList = tex.split(" ");
		
		for(String s : wordList) System.out.println(s);
		
		return wordList;
	}	
}
