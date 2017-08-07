package MPPExam.prob4.exam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordGame {
	//This method throws an IllegalWordException
	//Find a way to handle it. Use best practices

    /**
     *
     * @param words words for test
     * @return
     */
	public List<String> adjustWords(List<String> words) {
		return words.stream().map(new WordGame()::wordToLowerCase).collect(Collectors.toList());
	}


	/**
	 * Helper method for handling the exception, and actually best way of doing it
	 * @param word
	 * @return
	 */
	public String wordToLowerCase (String word){
		//error handled but can be better optimized
		String loweredString = null;
		try{
			loweredString = verifyWord(word).toLowerCase();
		} catch(IllegalWordException e){
			throw new RuntimeException();
		}

		return loweredString;
	}

    /**
     *  Given method
     * @param word
     * @return
     * @throws IllegalWordException
     */
	private String verifyWord(String word) throws IllegalWordException {
		if("A, B, C, E, M, N, R, S, T".contains(""+word.charAt(0))) {
			throw new IllegalWordException(
				"The first letter of " + word + " contains one of the illegal characters.");
		}
		return word;
	}
	
	public static void main(String[] args) {
		List<String> sampleList1 = Arrays.asList("Dog", "Horse", "Peanut", "Pepper", "Inch");
		List<String> sampleList2 = Arrays.asList("Dog", "Horse", "Peanut", "Mother", "Detergent");
		WordGame wg = new WordGame();
		
		//uncomment when you are ready
		System.out.println(wg.adjustWords(sampleList1));
		System.out.println(wg.adjustWords(sampleList2));
	}
	
	

}
