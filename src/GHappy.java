public class GHappy {
    public void gHappy(String str) {
        boolean t = false;
        if(str.length()<1)
        {
            t = true;
        }
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='g')
            {
                if(i<str.length()-1 && str.charAt(i+1)=='g')
                {
                    t = true;
                }
                else if(i>0 && str.charAt(i-1)=='g')
                {
                    t = true;
                }
                else
                {
                    t = false;
                }
            }
        }
        System.out.println(t);
    }

}
