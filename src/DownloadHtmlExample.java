import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;

public class DownloadHtmlExample {
  public static void main(String[] args) {
    
    try{
      // Create an URL object for the given URL string
      URL url = new URL("https://"); //placeholder
      boolean validInput = false;
      while(!validInput){
        try{
          Out.print("Please enter a valid URL: ");
          String urlString = In.readLine();
          url = new URL(urlString);
          validInput = true;
        }catch(MalformedURLException mUrlException){
          Out.println("MalformedURLException: The provided URL was not in the right format");
        }
      }
      // Open a connection to the URL and obtain the input stream
      // Using this stream, we can read the URL's content, i.e., the website's HTML.
      InputStream inputStream = url.openStream();
      // Read and print the HTML code char by char
      try{
        int ch = inputStream.read();
        while (ch != -1) {
          Out.print((char)ch);
          ch = inputStream.read();
        }
      }catch(IOException ioException){
        Out.println("Could not read character from stream");
      }finally{
        try{
          inputStream.close();
        }catch(IOException ioException){
          //Close the input stream
          Out.println("Could not close stream");
        }
      }

    }catch(IOException ioException){
        Out.println("Could not open stream to "+ioException.getMessage());
    }
  }
}
