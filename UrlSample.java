import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
/**
* https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
* @author padaboo I.B. Aleksandrov
*/
public class UrlSample {

 public static void main(String[] args) throws Exception {
   Scanner console = new Scanner (System.in);
 URL oracle = new URL("https://yandex.ru/");
 BufferedReader in = new BufferedReader(
 new InputStreamReader(oracle.openStream()));
 String inputLine;
 while ((inputLine = in.readLine()) != null)
 System.out.println(inputLine);
 in.close();
 String pause = console.next(); 
 }
}
