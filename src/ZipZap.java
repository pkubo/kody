public class ZipZap {
    public void zipZap(String str) {
        String result ="";
        for(int i = 0;i<str.length();i++)
        {
            if(str.length()-i>2 && str.charAt(i)=='z'&& str.charAt(i+2)=='p')
            {
                result = result + String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i+2));
                i=i+2;
            }
            else
            {
                result = result + String.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }

}
