public class MinCat {
    public void minCat(String a, String b) {
        int len = Math.min(a.length(),b.length());

        System.out.println(a.substring(a.length()-len,a.length())+b.substring(b.length()-len,b.length()));
    }

}
