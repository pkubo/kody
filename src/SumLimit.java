public class SumLimit {
    public void sumLimit(int a, int b) {
        String len = String.valueOf(a+b);
        int dl = len.length();
        String len2 = String.valueOf(a);
        int dla = len2.length();
        if(dl>dla)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(a+b);
        }
    }

}
