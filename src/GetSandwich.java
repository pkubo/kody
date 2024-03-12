public class GetSandwich {
    public void getSandwich(String str) {
        int k = 0;
        int p = 0;
        int l = 0;
        int w = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(str.length()-4>i && str.substring(i,i+5).equals("bread"))
            {
                p = i;
                break;
            }
        }
        for(int i = 0;i<str.length();i++)
        {
            if(str.length()-4>i && str.substring(i,i+5).equals("bread"))
            {
                k = i;
                l++;
            }
        }

        if(l<2)
        {
            System.out.println("");
        }
        else
        {

            System.out.println(str.substring(p+5,k));
        }
    }
}
