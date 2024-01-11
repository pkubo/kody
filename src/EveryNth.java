public class EveryNth {
    public static String everyNth(String str, int n) {
        String str2= "";
        int k = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(i==n *k|| i==0)
            {
                str2=str2+str.charAt(i);
                k++;
            }
        }
        return str2;
    }
}
