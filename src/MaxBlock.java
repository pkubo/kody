public class MaxBlock {
    public void maxBlock(String str) {
        int max = 0;
        if(str.length()>0)
        {
            max = 1;
        }
        int licz = 1;
        for(int i = 0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1) )
            {
                licz++;
                if(licz > max)
                {
                    max = licz;
                }
            }
            else
            {
                licz = 1;
            }
        }
        System.out.println(max);
    }

}
