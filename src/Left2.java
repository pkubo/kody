public class Left2 {
    public void left2(String str) {
        String front = str.substring(0,2);
        String end = str.substring(2,str.length());
        System.out.println(end + front);
    }

}
