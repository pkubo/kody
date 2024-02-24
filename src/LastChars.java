public class LastChars {
    public void lastChars(String a, String b) {
        char char_a = (a.length() > 0) ? a.charAt(0) : '@';
        char char_b = (b.length() > 0) ? b.charAt(b.length() - 1) : '@';

       System.out.println(String.valueOf(char_a)+String.valueOf(char_b));
    }

}
