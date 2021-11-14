import java.util.ArrayList;
import java.util.HashMap;

/** Nadia Rahbany
 * Markov.java Project
 *
 * CST 338
 */
public class Markov {
    private static final String PUNCTUATION = null;
    private static final String PUNCTUTATION_MARKS = null;
    private HashMap<String, ArrayList<String>> words;
    private String prevWord;


    public Markov() {

    }

     HashMap<String, ArrayList<String>> getWords() {
        return words;
    }

   public void addFromFile(String Addfromfile){

   }
    void addLine(String addline){

    }
    void addWord(String addword){

    }

   public Object getSentence(){

       return ( "spam.text");
   }


   public boolean endsWithPuncutation(String endswithpunctuation){
        return true;
   }

    @Override
    public String toString() {
        return "Markov{" +
                "words=" + words +
                ", prevWord='" + prevWord + '\'' +
                '}';
    }
}



