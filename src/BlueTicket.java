public class BlueTicket {
    public void blueTicket(int a, int b, int c) {
        if(a + b == 10 || a + c == 10 || b + c == 10)
        {
            System.out.println(10);
        }
        else if( (a + b >= b + c +10) || (a + b >= a + c +10))
        {
            System.out.println(5);
        }
        else
        {
            System.out.println(0);
        }
    }

}
