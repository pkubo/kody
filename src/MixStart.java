public class MixStart {
    public static boolean mixStart(String str) {
        String ix = "ix";
        if(str.length()>2)
        {
            String s = str.substring(1,3);
            if(s.equals(ix))
            {
                return true;
            }
            else return false;
        }
        else return false;
    }
}
