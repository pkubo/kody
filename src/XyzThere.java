public class XyzThere {
    public void xyzThere(String str) {
        int l = 0;
        for(int i =0;i<str.length()-2;i++)
        {
            if(str.length()>i+3 && str.charAt(i)!='.' && str.charAt(i+1)=='x'&& str.charAt(i+2)=='y'&& str.charAt(i+3)=='z')
            {
                l++;
            }
            else if(str.substring(0,3).equals("xyz"))
            {
                l++;
            }

        }
        if(l>0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }

    }
}
