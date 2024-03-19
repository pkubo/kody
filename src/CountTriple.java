public class CountTriple {
    public void countTriple(String str) {
        int tr = 0;
        if(str.length()<3)
        {

        }
        else
        {
            for(int i = 0; i <= str.length()-3;i++)
            {
                if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2))
                {
                    tr++;
                }
            }
        }
        System.out.println(tr);
    }

}
