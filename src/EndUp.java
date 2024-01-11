public class EndUp {
    public static String endUp(String str) {
        if(str.length()>2)
        {
            String front = str.substring(0,str.length()-3);
            String back = str.substring(str.length()-3,str.length());
            return front+ back.toUpperCase();
        }
        else return str.toUpperCase();
    }
}
