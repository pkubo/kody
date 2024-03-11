public class MixString {
    public void mixString(String a, String b) {
        String result = "";
        for(int i = 0;i<Math.min(a.length(), b.length());i++)
        {
            result = result + String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
        }
        System.out.println(result +a.substring(Math.min(a.length(), b.length()),a.length()) + b.substring(Math.min(a.length(), b.length()),b.length()));
    }

}
