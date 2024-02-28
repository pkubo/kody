public class DoubleChar {
    public void doubleChar(String str) {
        String s = "";
        for(int i = 0;i<str.length();i++)
        {
            s = s + String.valueOf(str.charAt(i))+String.valueOf(str.charAt(i));
        }
        System.out.println(s);
    }

}
