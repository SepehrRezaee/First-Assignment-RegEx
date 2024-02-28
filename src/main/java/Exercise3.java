import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    /*
    implement the method below so that it extracts a URL from a String
    I will write the basics for this one method, you will have to implement the other two methods from scratch
    */

    public static String extractURL(String text) {
        String regex = "write your regex pattern here!";  // TODO

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }

    /*
    implement the method below to validate an email address
     */

    public static boolean validateEmail(String email) {
        // TODO
        return false;
    }

    /*
    implement the method below so that it returns a list of words with repeated letters
    */

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        return wordsWithRepeatLetters;
        // TODO
    }

    /*
    Bonus Problem ;)
    implement the method below so that it returns a list of words that are repeated twice accidentally in a string
    for example: "appleapple orange pearpear pineapple" -> ["appleapple", "pearpear"]
    */

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        return repeatedWords;
        // TODO
    }

    public static void main(String[] args) {
        String text = "Visit https://www.example.com for more information.";
        String url = extractURL(text);
        System.out.println("Extracted URL: " + url);
    
        String email = "test@example.com";
        boolean isValidEmail = validateEmail(email);
        System.out.println("Is the email valid? " + isValidEmail);
    
        String input = "Hello, I love programming. It's really cool!";
        List<String> wordsWithRepeatLetters = findWordsWithRepeatLetters(input);
        System.out.println("Words with repeated letters: " + wordsWithRepeatLetters);
    
        String repeatedWordsInput = "appleapple orange pearpear pineapple";
        List<String> repeatedWords = findReapetdWords(repeatedWordsInput);
        System.out.println("Repeated words: " + repeatedWords);
    }

}
