public class OneTwo {
    public void oneTwo(String str) {
        int l =str.length()%3;
        String result = "";
        int w = str.length()/3;
        int z = 0;

        if(l==0)
        {
            for(int i = 0;i<str.length();i=i+3)
            {
                result = result + str.substring(i+1,i+3)+str.substring(i,i+1);
            }
        }
        else
        {
            for(int i = 0;i<str.length()-2;i=i+3)
            {
                result = result + str.substring(i+1,i+3)+str.substring(i,i+1);
                if(w<z)
                {
                    break;
                }
                z++;
            }
        }
        System.out.println(result);
    }

}
