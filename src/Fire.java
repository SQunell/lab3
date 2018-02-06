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
    public static void main(String[] unused){
        String[] hamletword=urlToString("http://erdani.com/tdpl/hamlet.txt").replace("\n"," ").split(" ");
        String[] dataword=urlToString("https://www.bls.gov/tus/charts/chart9.txt").replace("\n"," ").replace("\t"," ").split(" ");
        //int datacount=0;
        //for (String i : dataword) {
          //  if (!i.equals("") && !i.equals(" ")&& !i.equals("\n") && i!=null) {
            //    System.out.println(i);
              //  datacount+=1;
            //}
      //  }
        System.out.println(urlToString("https://www.bls.gov/tus/charts/chart9.txt"));
        System.out.println(hamletword.length);
       // System.out.println(datacount);
    }
}
