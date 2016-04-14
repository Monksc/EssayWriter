public class WordProperties() {
    
    public final String word;
    public final char type;
    public final String definition; 
    
    public WordProperties(String str) {
        // checks if its just one word or its from a textfile
        if (str.indexOf(" ") > 0) {
            
            // example code of whats happening
            /**
             * str = abase v. To lower in position, estimation, or the like; degrade.
             * 
             * word = abase
             * type = v
             * definition = To lower in position, estimation, or the like; degrade
             */
            
            int indexOfFirstSpace = str.indexOf(" ");
            word = str.substring(0,indexOfFirstSpace); // gets word out of str
            
            type = str.charAt(indexOfFirstSpace + 1); // sets type from str
            
            definition = str.substring(indexOfFirstSpace + 3);
        }
        else {
            
        }
    }
}