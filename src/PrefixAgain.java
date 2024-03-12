public class PrefixAgain {
    public void prefixAgain(String str, int n) {
        int k = 0;
        for(int i = n;i<str.length();i++)
        {
            if(str.length()-n >= i && str.substring(0,n).equals(str.substring(i,i+n)))
            {
                k++;
            }

        }
        if(k>0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
