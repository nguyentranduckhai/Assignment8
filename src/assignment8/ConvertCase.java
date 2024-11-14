package assignment8;

public class ConvertCase {

    public static String convertCase(String str) {
        if (str == null) {
            return ""; // Tra ve chuoi rong~ neu chuoi dau vao la null ( null la bien do hien khong co du lieu hoac chua khoi tao.
        }

        StringBuilder convert = new StringBuilder();//Tao StringBuilder de noi cac ky tu da chuyen doi

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //Character la phuong thuc kiem tra xem 1 char co phai la chu hoa hay khong

            if (Character.isUpperCase(c)) {//Kiem tra neu ky tu la chu In hoa
                convert.append(Character.toLowerCase(c)); //Doi chu in hoa thanh chu thuong
            } else if (Character.isLowerCase(c)) {//Kiem tra neu ky tu la chu thuong
                convert.append(Character.toUpperCase(c)); //Doi chu thuong thanh chu in hoa
            } else {
                convert.append(c); //Giu nguyen ky tu khong phai la chu cai
            }
        }

        return convert.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Hello World");
        System.out.println("String after convert: " + convertCase(str));
    }

}
