public class RedTicket {
    public void redTicket(int a, int b, int c) {
        if(a == 2 && b == 2 && c == 2)
        {
            System.out.println(10);
        }
        else if(a == b && a == c)
        {
            System.out.println(5);
        }
        else if(a != b && a != c)
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }
    }

}
