public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
        if(((a<=19 && a>=13)&&(b>19||b<13))||((b<=19&&b>=13)&&(a>19||a<13)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
