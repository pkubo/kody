public class SameEnds {
    public void sameEnds(String string) {
        String result = "";
        int len1 = 0;
        int len2 = 0;
        int o = 0;
        for(int i = 1;i<string.length();i++)
        {
            if(string.charAt(0)==string.charAt(i))
            {
                len1 = string.substring(i,string.length()).length();
                for(int j = 0;j<string.length()-1;j++)
                {
                    if(i>j && string.charAt(string.length()-1)==string.charAt(j))
                    {
                        len2 = string.substring(0,j+1).length();
                        if(len2 == len1)
                        {
                            if(len2>=o)
                            {
                                result = string.substring(0,len2);
                                o = len2;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }

}
