public class MaxMod5 {
    public void maxMod5(int a, int b) {
        if(a == b)
        {
            System.out.println(0);
        }
        else if(a%5 == b%5)
        {
            if(a>b)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(a);
            }
        }
        else
        {
            if(a<b)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(a);
            }
        }
    }

}
