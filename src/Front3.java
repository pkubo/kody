public class Front3 {
    public static String front3(String str) {
        if(str.length()>3)
        {
            String front = str.substring(0,3);
            return front + front +front;
        }
        else
            return str+str+str;
    }
}
