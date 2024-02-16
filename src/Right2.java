public class Right2 {
    public void right2(String str) {
        String end = str.substring(str.length()-2,str.length());
        String front = str.substring(0,str.length()-2);
        System.out.println(end + front);
    }

}
