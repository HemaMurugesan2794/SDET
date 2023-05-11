package practiceProblems;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

public class SortSentence {



	
	
	
	@Test
	public void example1()
	{
	
	String sentence = "This4 is2 a1 sample3 sentence5";
    String sortedSentence = sortSentence(sentence);
    System.out.println(sortedSentence);
	}
	
	
	
	
	
	
	public static String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> map = new TreeMap<>();

        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1));
            map.put(index, word.substring(0, word.length() - 1));
        }

        StringBuilder sortedSentence = new StringBuilder();
        for (String word : map.values()) {
            sortedSentence.append(word).append(" ");
        }

        return sortedSentence.toString().trim();
    }


}
