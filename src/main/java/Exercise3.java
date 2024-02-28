import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise3 {

    public static String extractURL(String text) {
        String regex = "(http|https)://[^\\s]*";  // URL pattern

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
        return email.matches(regex);
    }

    public static List<String> findWordsWithRepeatLetters(String input) {
        List<String> wordsWithRepeatLetters = new ArrayList<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.matches(".*([a-zA-Z]).*\\1.*")) {
                wordsWithRepeatLetters.add(word);
            }
        }
        return wordsWithRepeatLetters;
    }

    public static List<String> findReapetdWords(String input) {
        List<String> repeatedWords = new ArrayList<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            if (word.matches("^(\\w+)\\1$")) {
                repeatedWords.add(word);
            }
        }
        return repeatedWords;
    }

    public static void main(String[] args) {
        String text = "Visit https://assistant.github.com for more information.";
        System.out.println("Extracted URL: " + extractURL(text));

        String email = "test@example.com";
        System.out.println("Is valid email: " + validateEmail(email));

        String input = "apple banana carrot doodle elephant";
        System.out.println("Words with repeat letters: " + findWordsWithRepeatLetters(input));

        String repeatedWordsInput = "appleapple orange pearpear pineapple";
        System.out.println("Repeated words: " + findReapetdWords(repeatedWordsInput));
    }
}
