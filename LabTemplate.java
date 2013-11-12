import java.net.*;
import javax.net.ssl.*;
import java.io.*;

public class LabTemplate{

  // All edits will be made to the main method
  public static void main(String[] args){
    // We can easily print out some arbitrary text here
    System.out.println("Hello, World");
    // But if we want to do something more interesting
    // we can retrieve content from some website here
    // We need to ensure that we use a url that starts with https
    // the s is important
    String url = "http://example.com";
    // We can print out the contents of any https site now!
    System.out.println( enlightenMe(url) );
  }

  /****************************
   * Some url's to try
   * https://api.github.com/zen
   *         OR
   * https://api.github.com/octosay
   *
   *
   * For this part of the lab, you need to choose one of the above urls 
   * and use it as the 'url' variable in main
   *
   * You can compile this file then and run it and see the output.
   * (Try it multiple times, it changes!)
   *
   *
   * Now check the section "Collaboration" on the lab writeup on github
   *
   * Now your partner needs to pick a different url, change it in his copy of your repository,
   * add, commit and push the changes.
   * You will then add, commit and attempt to push your changes.
   *
   * Git will tell you (in a wordier way) that you haven't pulled in a while and there is new data,
   * so you will need to pull before you can push your changes.
   *
   * When you pull the latest commits, you will be informed that there is a merge conflict.
   * You need to fix this before you'll be able to push your changes.
   *
   * If you recall, a merge conflict occurs when git doesn't know which changes you want.
   *
   * So if you open up your copy of LabTemplate.java, you'll see a section that looks
   *
   *
   *
   ****************************
  */

  // You can safely ignore this method today
  public static String enlightenMe(String url){
    try{
      URL zen = new URL(url);
      HttpsURLConnection conn = (HttpsURLConnection) zen.openConnection();
      BufferedReader in = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
      StringBuilder sb = new StringBuilder();
      String inputLine;
      String NEWLINE = System.getProperty("line.separator");
      while ( (inputLine = in.readLine()) != null ){
        sb.append(inputLine);
        sb.append(NEWLINE);
      }
      return sb.toString();
    } catch (ClassCastException e){
      return "Did you try to use a https url?";
    } catch (Exception e){
      System.out.println(e.toString());
      return "An error occurred";
    }
  }
}
