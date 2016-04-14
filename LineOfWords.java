public class LineOfWords {
    
    public final WordProperties[] words;
    
    public LineOfWords(String line) {
        String[] wordsAsString = getWords(line);
        wordsProperties = new WordProperties[wordsAsString.length];
        
        for (int i = 0; i < wordsProperties.length; i++) {
            wordsProperties[i] = WordProperties(wordsAsString[i]);
        }
    }
    
    private String[] getWords(String str) {
        String[] r = new String[howManyWords(str)];
        
        int index = 0;
        for (int i = 0; i < r.length; i++) {
            index++;
            int newIndex = str.indexOf(" " index);
            String newWord = str.substring(index, newIndex);
            r[i] = newWord;
            index = newIndex;
        }
        
        return r;
    }
    
    private int howManyWords(String line) {
        int count = 0;
        int index = 0;
        
        while (line.indexOf(" ", index) != 0) {
            index = line.indexOf(" ", index) + 1
            
            count++;
        }
        
        return count;
    }
}