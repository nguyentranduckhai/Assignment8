package assignment8;

public class CountTheNumberOfWord {

    public static int countWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) { //null la gia tri khong ton tai hoac chua khai bao gia tri
            return 0; //Tra ve 0 neu chuoi la null hoac trong rong
        }

        String[] words = sentence.split(" ");//Tach chuoi thanh mang cac tu dua vao dau cach

        return words.length;// So tu trong chuoi la so phan tu cua mang
    }

    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println("Java is fun");
        System.out.println("The number of word in string : " + countWord(sentence) + " words");
    }

}
