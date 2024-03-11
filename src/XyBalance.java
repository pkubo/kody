public class XyBalance {
    public void xyBalance(String str) {
        int indexx = 0;
        int lx = 0;
        int indexy = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='x')
            {
                indexx=i;
                lx++;
            }
            else if(str.charAt(i)=='y')
            {
                indexy=i;
            }

        }
        if(indexx<indexy || lx == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
