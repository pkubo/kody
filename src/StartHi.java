public class StartHi {
    public static boolean startHi(String str) {
        if(str.length()<2)
        {
            return false;
        }
        else
        {
            String hi = "hi";
            String front = str.substring(0,2);
            if(hi.equals(front))
            {
                return true;
            }
            else
                return false;
        }
    }

}
