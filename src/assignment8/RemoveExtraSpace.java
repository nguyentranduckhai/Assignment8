package assignment8;

public class RemoveExtraSpace {

    public static String removeExtra(String str) {
        str = str.trim(); // Xoa khoang trang o dau va cuoi
        str = str.replaceAll("\\s+", " ");//Thay the tat ca khoang trong lien tiep thanh 1 khoang trong
        return str;
    }

    public static void main(String[] args) {
        String str = "  Hello   World  ";
        String result = removeExtra(str);
        System.out.println("String before remove extra space : " + str);
        System.out.println("String after remove extra space : " + result);

    }

}
