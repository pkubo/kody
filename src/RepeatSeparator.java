public class RepeatSeparator {
    public void repeatSeparator(String word, String sep, int count) {
        String result = "";
        for(int i = 0; i<count; i++)
        {
            if(i<count-1)
            {
                result = result + word + sep;
            }
            else
            {
                result = result + word;
            }
        }
        System.out.println(result);
    }
}
