public class EqualIsNot {
    public void equalIsNot(String str) {
        int is = 0;
        int not = 0;

        for(int i = 0;i<=str.length()-2;i++)
        {
            if(str.substring(i,i+2).equals("is"))
            {
                is++;
            }
        }

        for(int i = 0;i<=str.length()-3;i++)
        {
            if(str.substring(i,i+3).equals("not"))
            {
                not++;
            }
        }

        if(is == not)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
