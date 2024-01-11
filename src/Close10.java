public class Close10 {
    public static int close10(int a, int b) {
        int mina = Math.abs(10-a);
        int minb = Math.abs(10-b);
        if(mina==minb)
            return 0;
        else if(mina>minb)
            return b;
        else return a;
    }
}
