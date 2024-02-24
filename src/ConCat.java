public class ConCat {
    public void conCat(String a, String b) {
        if(a.length()>0 && b.length()>0 && a.charAt(a.length()-1)==b.charAt(0))
        {
            System.out.println( a + b.substring(1,b.length()));
        }
        else
        {
            System.out.println( a + b);
        }
    }

}
