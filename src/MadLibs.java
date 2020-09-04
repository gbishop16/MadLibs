import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MadLibs
{
	
	//0. Give variable names for each of the arraylists below and create Madlibs stories.
	public static void main(String[] args) throws IOException 
	{
		
	//1. Read a nouns.txt file and store its list of nouns into an arraylist.
	
	BufferedReader br = new BufferedReader(new FileReader("nouns.txt"));
	ArrayList nouns = new ArrayList<String>();
	while(br.ready())
	{
		for(int i = 0; i<11; i++)
		{
			
			nouns.add(br.readLine());
			
		}
	}
	br.close();
	
	System.out.print(nouns);
	//2. Read a verbs.txt file and store its list of verbs into an arraylist.
	
	}
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
}
