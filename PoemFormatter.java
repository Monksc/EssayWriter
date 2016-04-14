public class PoemFormatter {
    
    public Line
    OfWords[] lines;
    
    public PoemFormatter(String[] poem) {
        lines = new LineOfWords[poem.length];
        
        for (int i = 0; i < poem.length; i++) {
            lines[i] = LineOfWords(poem[i]);
        }
    }

}