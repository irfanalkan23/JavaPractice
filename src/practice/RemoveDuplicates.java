package practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAAFFLLLDEE";
        String result = "";
        while (str.length() > 0) {
            for (int i = 0; i < str.length(); i++) {
                result += str.charAt(0);
                str = str.replace("" + str.charAt(0), "");
            }
        }
        System.out.println(result);
    }
}
