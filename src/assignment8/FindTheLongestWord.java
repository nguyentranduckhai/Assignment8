package assignment8;

public class FindTheLongestWord {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) { // null la chuoi chua duoc khoi tao hoac khong co gia tri
            return "";
        }

        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "I love programming";
        System.out.println("I love programming");
        System.out.println("The longest word is: " + findLongestWord(sentence));
    }

}
