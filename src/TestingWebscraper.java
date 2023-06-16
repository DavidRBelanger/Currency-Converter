
import java.io.IOException;

/*
    David R Belanger
    Shenendehowa High School
    Mr. Hanley's T.A.
    davidrbelanger@gmail.com
*/
public class TestingWebscraper {
    public static void main(String[] args) {
        //WebScraper ws = new WebScraper("https://www.x-rates.com/table/?from=USD&amount=1","<td class='rtRates'><a href='https://www.x-rates.com/graph/?from=USD&amp;to=EUR'>","</a></td>");
        String website = "https://www.x-rates.com/table/?from=USD&amount=1";
        String first = "<td class='rtRates'><a href='https://www.x-rates.com/graph/?from=USD&amp;to=EUR'>";
        String second = "</a></td>";
        WebScraper ws = new WebScraper(website,first,second);
        System.out.println(ws.retrieve());
        System.out.println(ws.getData());
    }
}
