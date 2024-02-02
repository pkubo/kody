public class FrontTimes {
    public void frontTimes(String str, int n) {
        String result = "";

        if(str.length()>2)
        {
            String l3 = str.substring(0,3);
            for(int i = 0;i<n;i++)
            {
                result = result +l3;
            }
        }
        else
        {
            for(int i = 0;i<n;i++)
            {
                result = result + str;
            }
        }
        System.out.println(result);
    }
}
