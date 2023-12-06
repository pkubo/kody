public class NotString {
    public static String notString(String str) {
        if(str.length()<3)
        {
            return "not "+str;
        }
        else
        {
            String front = str.substring(0,3);
            String not = "not";
            if(not.equals(front))
            {
                return str;
            }
            else
                return "not "+str;
        }
    }

}
