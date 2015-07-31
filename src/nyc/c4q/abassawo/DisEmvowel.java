package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 7/31/15.
 */
public class DisEmvowel {

    public static void main(String[] args) {
        System.out.println(disembowel("Aerek Gumb"));
    }

    public static String disembowel(String word){
        String newWord = word;
        boolean hasVowel = ( newWord.contains("a") ||
                newWord.contains("e") ||
                newWord.contains("i") ||
                newWord.contains("o") ||
                newWord.contains("u") ) ;

        boolean hasVOWEL = (
                newWord.contains("A") ||
                        newWord.contains("E") ||
                        newWord.contains("I") ||
                        newWord.contains("O") ||
                        newWord.contains("U") ) ;
        if (hasVowel){
            newWord = newWord.replace("a", "");
            newWord = newWord.replace("e", "");
            newWord = newWord.replace("i", "");
            newWord = newWord.replace("o", "");
            newWord = newWord.replace("u", "");
        }
        if (hasVOWEL){
            newWord = newWord.replace("A", "");
            newWord = newWord.replace("E", "");
            newWord = newWord.replace("I", "");
            newWord = newWord.replace("O", "");
            newWord = newWord.replace("U", "");
        }

        return newWord;
    }
}
