public class BackAround {
    public static String backAround(String str) {
        String back =str.substring(str.length()-1,str.length());
        return back + str + back;
    }
}
