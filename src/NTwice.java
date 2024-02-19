public class NTwice {
    public void nTwice(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(str.length()-n,str.length());
        System.out.println(front + back);
    }
}
