public class PoemFormatter {
    
    public LineOfWords[] lines;
    
    public PoemFormatter(String[] poem) {
        System.out.println(poem.length);
        lines = new LineOfWords[poem.length];
        
        for (int i = 0; i < poem.length; i++) {
            System.out.print(i + ") " + poem[i] + " : \n\t->");
            LineOfWords newLine = new LineOfWords(poem[i]);
            System.out.println(newLine);
            lines[i] = newLine;
        }
    }
    
    @Override
    public String toString() {
        String str = "";
        for (LineOfWords line: lines) {
            str = str + line + "\n";
        }
        
        return str;
    }

}