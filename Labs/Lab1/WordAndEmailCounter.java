import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordAndEmailCounter {

    
    public int countWords(String fileName) {
        int wordCount = 0;
        String line;

        
        String regex = "\\b\\w+\\b";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    wordCount++; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordCount;
    }

    
    public int countEmails(String fileName) {
        int emailCount = 0;
        String line;

        
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    emailCount++; 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return emailCount;
    }

    public static void main(String[] args) {
        WordAndEmailCounter counter = new WordAndEmailCounter();
        
        // Example usage4
        int wordCount = counter.countWords("example.txt");
        int emailCount = counter.countEmails("example.txt");

        System.out.println("Number of Words: " + wordCount);
        System.out.println("Number of Emails: " + emailCount);
    }
}
