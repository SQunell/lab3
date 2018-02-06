import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 * does some straight fire, yo.
 */
public class Fire {
    /**
     * turns a url into a string.
     * obviously
     * ya hidjit
     * @param url String of the url to be converted
     * @return String of the text on that url
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
    /**
    counts words on a specific url.
    @param words array of words to be counted through
    @return the integer number of instances of "Prince", "prince" or anything with prince in it
     */
    public static int wordcount(String[] words){
        int count = 0;
        for (String word : words){
            if (word.toLowerCase().contains("prince")){
                count+=1;
            }
        }
        return count;
    }
    /**
    doin a whole lot o hecko and counting unique words i guess.
    @param words array of words to be analyzed
    @return integer count of number of unique words
     */
    public static int wordcount2(String[] words){
        int count=0;
        String[] uniquewords= new String[words.length];
        for (String word :words){
            String betterword = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
            boolean unique = true;
            for (String uniques :uniquewords){
                if (betterword.equals(uniques)){
                    unique=false;
                }
            }
            if (unique==true){
                uniquewords[count]=betterword;
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] unused){
        String[] hamletword=urlToString("http://erdani.com/tdpl/hamlet.txt").split("\\s+");
        System.out.println(hamletword.length);
        System.out.println(wordcount(hamletword));
        System.out.println(wordcount2(hamletword));
       // System.out.println(datacount);
    }
}
