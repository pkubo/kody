public class LastDigit2 {
    public void lastDigit(int a, int b, int c) {
        if(a%10 == b%10 || a%10 == c%10 || b%10 == c%10)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
