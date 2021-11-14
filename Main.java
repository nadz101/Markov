/** Nadia Rahbany
 * Main.java for Markov Project
 * This class will execute the spam.txt
 * CST 338
 */
public class Main {
    public static void main(String[] args) {
        Markov markov = new Markov();

        markov.addFromFile("spam.txt");
        System.out.println(markov);

        for (int i= 0; i< 10; i ++){
            System.out.println(markov.getSentence());
        }
    }
}
