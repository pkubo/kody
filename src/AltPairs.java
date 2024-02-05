public class AltPairs {
    public void altPairs(String str) {
        String result="";
        for(int i = 0;i<str.length();i=i+4)
        {
            result = result + str.charAt(i);
            if(i+1<str.length())
            {
                result = result +str.charAt(i+1);
            }
        }
        System.out.println(result);
    }
}
