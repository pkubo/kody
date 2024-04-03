public class TwoAsOne {
    public void twoAsOne(int a, int b, int c) {
        if(a + b == c || a + c == b || b + c == a)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
