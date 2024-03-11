public class BobThere {
    public void bobThere(String str) {
        int l = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.length()>2+i && str.charAt(i)=='b' && str.charAt(i+2)=='b')
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
