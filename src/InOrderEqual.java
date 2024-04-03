public class InOrderEqual {
    public void inOrderEqual(int a, int b, int c, boolean equalOk) {
        boolean t = false;
        if(equalOk == true)
        {
            if(a <= b )
            {
                if(b <= c)
                {
                    t = true;
                }
            }
        }
        else
        {
            if(a < b )
            {
                if(b < c)
                {
                    t = true;
                }
            }
        }
        System.out.println(t);
    }

}
