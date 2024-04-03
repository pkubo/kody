public class LessBy10 {
    public void lessBy10(int a, int b, int c) {
        if(a >= b + 10 || a >= c +10 || c >= b +10 || c >= a + 10 || b >= a +10 || b >= c +10)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
