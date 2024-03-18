public class SameStarChar {
    public void sameStarChar(String str) {
        boolean t = true;
        int l = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='*')
            {
                l++;
            }
        }

        for(int i = 0;i<str.length();i++)
        {
            if( l==0 || str.length()<3)
            {
                t= true;
            }
            else if(str.charAt(0)=='*' || str.charAt(0)!='*' )
            {
                if(i>0 && str.length()-1>i && str.charAt(i)=='*' &&str.charAt(i-1)==str.charAt(i+1))
                {
                    t= true;
                }
                else if(i>0 && str.length()-1>i && str.charAt(i)=='*' &&str.charAt(i-1)!=str.charAt(i+1))
                {
                    t= false;
                }

            }

        }
        System.out.println(t);
    }

}
