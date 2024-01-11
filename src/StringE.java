public class StringE {
    public static boolean stringE(String str) {
        int l=0;
        String e = "e";
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)== 'e')
            {
                l=l+1;
            }
        }
        if(l<=3&&l>=1)
            return true;
        else return false;
    }
}
