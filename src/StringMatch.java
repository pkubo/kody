public class StringMatch {
    public void stringMatch(String a, String b) {
        int l = 0;
        int len = Math.min(a.length(), b.length());
        for(int i = 0;i<len-1;i++)
        {
            String suba = a.substring(i,i+2);
            String subb = b.substring(i,i+2);

            if(suba.equals(subb))
            {
                l =l+1;
            }
        }
        System.out.println(l);
    }

}
