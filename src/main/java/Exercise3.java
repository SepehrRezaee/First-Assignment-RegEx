import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public static String extractURL(String text) {
        String regex = "(https?://[\\w.-]+(?:\\.[\\w\\.-]+)+[\\w\\-\\._~:/?#[\\]@!$&'()*+,;=]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
    
        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }


    public static boolean validateEmail(String email) {
        String regex = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[a-zA-Z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String regex = "\\b\\w*([\\w-])\\w*\\1+\\w*\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
    
        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }
        return wordsWithRepeatLetters;
    }

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        String regex = "\\b(\\w+)(\\b.*\\b)\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
    
        while (matcher.find()) {
            repeatedWords.add(matcher.group(1));
        }
        return repeatedWords;
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
