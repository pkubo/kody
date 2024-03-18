public class WordEnds {
    public void wordEnds(String str, String word) {
        String result = "";
        for(int i = 0;i<str.length();i++)
        {
            if(i==0 && str.length()>2 && str.substring(i,i+word.length()).equals(word))
            {
                result = String.valueOf(str.charAt(word.length()));

            }
            else if(i>0 && str.length()-word.length()>i && str.substring(i,i+word.length()).equals(word))
            {
                result = result + String.valueOf(str.charAt(i-1))+String.valueOf(str.charAt(i+word.length()));

            }
            else if(str.length()>2 && i+word.length() == str.length() && str.substring(i,str.length()).equals(word))
            {
                result = result + String.valueOf(str.charAt(i-1));
            }
        }
        System.out.println(result);
    }

}
