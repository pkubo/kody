public class GreenTicket {
    public void greenTicket(int a, int b, int c) {
        if(a==b && b==c)
        {
            System.out.println(20);
        }
        else if((a == b && a!=c) || (a == c && a!=b) || (b == c && b!=a))
        {
            System.out.println(10);
        }
        else
        {
            System.out.println(0);
        }
    }

}
