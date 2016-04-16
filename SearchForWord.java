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
    
    public static WordProperties[] getWordPropertiesGivenSetOfWordsInDefinition(String[] words) {
        return WordProperties(getDictionaryLineFromWord(word));
    }
    
    public static WordProperties getBestWordPropertiesGivenWordProperties(WordProperties word) {
        WordProperties[] wordProperties = getWordPropertiesGivenType(word.type);
        
        // returns word if they is nothing inside of wordProperties
        if (wordProperties.length == 0) {
            return word;
        }
        
        WordProperties bestWord = wordProperties[0];
        int closeNess = 0;
        
        for (int i = 0; i < wordProperties.length; i++) {
            int newCloseness = 0;
            
            // checks to see if they start with same letter
            if (wordProperties[i].word.substring(0,1).equalsIgnoreCase(word.word.substring(0,1))) {
                newCloseness = 4;
            }
            
            for (int i = 0; i < word.word.length() && i < wordProperties[i].word.length(); i++) {
                if (word.word.substring(word.word.length() - i - 1, word.word.length() - i).equals(wordProperties[i].word.substring(wordProperties[i].word.length() - i - 1, wordProperties[i].word.length() - i))) {
                    newCloseness++;
                }
                else {
                    break;
                }
            }
            
            if (newCloseness > closeNess) {
                closeNess = newCloseness;
                bestWord = wordProperties[i];
            }
        }
        
        return bestWord;
    }
    
    public static WordProperties[] getWordPropertiesGivenType(char type) {
        
    }
    
    private static String getDictionaryLineFromWord(String word) {
        String fileName = "../Dictionar/ListOf" + word.charAt(0) + "Words.txt";
    }
    
    private static String[] getDictionaryLinesFromWordsInDefinition(String[] words) {
        
        for (char letter: alphabet) {
            String fileName = "../Dictionary/ListOf" + letter + "Words.txt";
            
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