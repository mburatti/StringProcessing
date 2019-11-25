package Strings;

public class Main {

	public static void main(String[] args) {
		String tex = Text.LETTER1.toString();
		String[] wordList = WordList.Process(tex);
		Tree tree = Tree.getInstance();
		
		for(String s : wordList) {
			tree.word(s);
		}
	}

}
