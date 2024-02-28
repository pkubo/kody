public class CountCode {
    public void countCode(String str) {
        int l = 0;
        for(int i = 0;i<str.length()-3;i++)
        {
            if(str.charAt(i)=='c'&& str.charAt(i+1)=='o'&& str.charAt(i+3)=='e')
            {
                l++;
            }
        }
        System.out.println(l);
    }
}
