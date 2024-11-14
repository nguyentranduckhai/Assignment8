package assignment8;

public class SplitWordInString {

    public static String[] splitWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) { // neu sentence la null hoac khoang trong 
            return new String[0]; // Thi tra ve la mot chuoi rong~
        }

        String[] words = sentence.split(" ");//Tach cau thanh cac tu dua vao dau cach
        return words;
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println("Java is fun");
        String[] wordsArray = splitWords(sentence);

        for (String word : wordsArray) {//In tung tu trong Chuoi
            System.out.println(word);
        }

    }
}
