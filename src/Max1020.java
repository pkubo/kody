public class Max1020 {
    public static int max1020(int a, int b) {
        if((a>=10&&a<=20)&&(b>20||b<10))
        {
            return a;
        }
        else if((b>=10&&b<=20)&&(a>20||a<10))
        {
            return b;
        }
        else if((a>=10&&a<=20)&&(b>=10&&b<=20))
        {
            if(a>b)return a;
            else return b;
        }
        return 0;
    }
}
