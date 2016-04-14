/**
 * Searches for word in dictionary
 */
public class SearchForWord {
    
    private static char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public SearchForWord () {
    
    }
    
    public static WordProperties getWordPropertiesGivenWord(String word) {
        return WordProperties(getDictionaryLineFromWord(word));
    }
    
    public static WordProperties getWordPropertiesGivenSetOfWordsInDefinition(String[] words) {
        return WordProperties(getDictionaryLineFromWord(word));
    }
    
    public static WordProperties getWordPropertiesGivenWord(String word) {
        return WordProperties(getDictionaryLineFromWord(word));
    }
    
    private static String getDictionaryLineFromWord(String word) {
        String fileName = "ListOf" + word.charAt(0) + "Words.txt";
    }
    
    private static String[] getDictionaryLinesFromWordsInDefinition(String[] words) {
        
        for (char letter: alphabet) {
            String fileName = "ListOf" + letter + "Words.txt";
            
        }        
    }
    
    private static boolean isEachWordInString(String[] words, String str) {
        for (String w: words) {
            if (str.indexOf(w) == -1) { // might have to change it to str.indexOf(" " + w + " ")
                return false;
            }
        }
        
        return true;
    }
}