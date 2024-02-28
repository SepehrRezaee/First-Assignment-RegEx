import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static String extractURL(String text) {
        String regex = "(https?://[\\w-]+(\\.[\\w-]+)+(/([\\w- ./?%&=]*)?)?)";  // TODO
    
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
    
        if (matcher.find()) {
            return matcher.group();
        }
        else{
            return null;
        }
    }


    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String regex = "\\b\\w*(\\w)\\1+\\w*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            wordsWithRepeatLetters.add(matcher.group());
        }

        return wordsWithRepeatLetters;
    }

    public static List<String> findRepeatedWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        String regex = "\\b(\\w+)\\1\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            repeatedWords.add(matcher.group());
        }

        return repeatedWords;
    }

    public static void main(String[] args) {
        // Test validateEmail method
        System.out.println(validateEmail("test@example.com"));  // Should return true
        System.out.println(validateEmail("invalid_email"));  // Should return false
    
        // Test extractURL method
        System.out.println(extractURL("Check out https://www.example.com for more information."));  // Should return "https://www.example.com"
        System.out.println(extractURL("No URL here."));  // Should return null
    
        // Test findWordsWithRepeatLetters method
        System.out.println(findWordsWithRepeatLetters("apple banana berry cherry"));  // Should return ["berry", "cherry"]
    
        // Test findRepeatedWords method
        System.out.println(findRepeatedWords("appleapple orange pearpear pineapple"));  // Should return ["appleapple", "pearpear"]
    }

}
