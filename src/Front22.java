public class Front22 {
    public static String front22(String str) {
        if(str.length()>2)
        {
            String front =str.substring(0,2);
            return front + str + front;
        }
        else
            return str+str+str;
    }
}
