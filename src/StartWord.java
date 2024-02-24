public class StartWord {
    public void startWord(String str, String word) {
        if(str.length()>1 && word.length()>=1 && str.substring(1,word.length()).equals(word.substring(1,word.length())))
        {
            System.out.println(str.substring(0,word.length()));
        }
        else if(str.length()==1 && word.length()==1)
        {
            System.out.println(str);
        }
        else
        {
            System.out.println("");
        }
    }

}
