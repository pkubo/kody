public class Last2 {
    public void last2(String str) {
        int l = 0;
        if(str.length()>2)
        {
            String back = str.substring(str.length()-2,str.length());

            for(int i = 0 ;i<str.length()-2;i++)
            {
                String in =str.substring(i,i+2);
                if(back.equals(in))
                {
                    l = l+1;
                }
            }
        }
        System.out.println(l);
    }

}
