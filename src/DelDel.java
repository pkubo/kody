public class DelDel {
    public static String delDel(String str) {
        if(str.length()>3)
        {
            String del = "del";
            String front = str.substring(1,4);

            if(del.equals(front))
            {
                return str.substring(0,1)+str.substring(4,str.length());
            }
            else
            {
                return str;
            }
        }
        else return str;
    }
}
