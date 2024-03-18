public class StarOut {
    public void starOut(String str) {
        String result = "";
        for(int i = 0; i<str.length();i++)
        {
            if(str.length()>i+1  && str.charAt(i+1)=='*')
            {

            }
            else if(i>0  && str.charAt(i-1)=='*')
            {

            }
            else if(str.charAt(i)!='*')
            {
                result = result + String.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }

}
