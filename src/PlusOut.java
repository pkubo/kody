public class PlusOut {
    public void plusOut(String str, String word) {
        String result = "";
        int lw = word.length();
        for(int i = 0;i < str.length() ;i++)
        {
            if(str.length() - (lw-1) > i && str.substring(i,i+lw).equals(word))
            {
                result = result + word;
                i = i +lw -1;
            }
            else
            {
                result = result + "+" ;
            }

        }

        System.out.println(result);
    }

}
