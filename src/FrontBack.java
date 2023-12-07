public class FrontBack {
    public static String frontBack(String str) {
        if(str.length()>1)
        {
            String front = str.substring(0,1);
            String back = str.substring(str.length()-1,str.length());
            String med = str.substring(1,str.length()-1);
            return back+med+front;
        }
        else
        {
            return str;
        }
    }

}
