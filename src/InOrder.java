public class InOrder {
    public void inOrder(int a, int b, int c, boolean bOk) {
        if(b>a || bOk == true)
        {
            if(c > b)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }

        }
        else
        {
            System.out.println(false);
        }

    }

}
