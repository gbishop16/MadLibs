import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MadLibs
{
	
	//0. Give variable names for each of the arraylists below and create Madlibs stories.
	public static void main(String[] args) throws FileNotFoundException
	{
		
	//1. Read a nouns.txt file and store its list of nouns into an arraylist.
	
	BufferedReader br = new BufferedReader(new FileReader("nouns.txt"));
	//2. Read a verbs.txt file and store its list of verbs into an arraylist.
	
	}
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
	ArrayList<String> adjectives = new ArrayList<String>();
	BufferedReader adjectivesReader = new BufferedReader(new FileReader("adjectives.txt"));
		while(adjectivesReader.ready()){
			adjectives.add(adjectivesReader.readLine());
		}
	adjectivesReader.close();
}
	