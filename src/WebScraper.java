/*
    David R Belanger
    Shenendehowa High School
    Mr. Hanley's T.A.
    davidrbelanger@gmail.com
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebScraper {

    private String data; //the data as a whole;
    private String startingKey; //what the webscraper looks for.
    private String endKey; //what the webscraper ends. All data collected is after the starting key and before the end key (exclusive for both)
    private String website; //website URL

    public WebScraper() {

    }

    public WebScraper(String s) {
        website = s;
    }

    public WebScraper(String a, String b, String c) {
        website = a;
        startingKey = b;
        endKey = c;
    }

    public String getData() {
        URL url;
        try {
            url = new URL(website);
            Scanner sc = new Scanner(url.openStream());
            StringBuffer sb = new StringBuffer();
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append("\n");
            }
            String result = sb.toString();
            return result;
        } catch (MalformedURLException ex) {
            Logger.getLogger(WebScraper.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(WebScraper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String retrieve() {
        data = this.getData();
        int firstIndex = data.indexOf(startingKey) + startingKey.length() + 1;
        System.out.println(firstIndex);
        int secondIndex = data.indexOf(endKey, firstIndex);
        System.out.println(secondIndex);
        return data.substring(firstIndex, secondIndex);
    }
}
