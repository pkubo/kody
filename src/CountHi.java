public class CountHi {
    public void countHi(String str) {
        int l = 0;
        for(int i = 0;i<str.length()-1;i++)
        {
            if(str.substring(i,i+2).equals("hi"))
            {
                l++;
            }
        }
        System.out.println(l);
    }
}
