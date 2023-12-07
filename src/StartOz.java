public class StartOz {
    public static String startOz(String str) {
        String o ="o";
        String z = "z";
        String oz = "oz";
        if(str.length()>1)
        {
            String sub1 = str.substring(0,2);
            if(sub1.equals(oz))
            {
                return oz;
            }
            else if(str.substring(1,2).equals(z))
            {
                return z;
            }
            else if(o.equals(str.substring(0,1)))
            {
                return o;
            }
        }
        else if(str.length()==1)
        {
            if(o.equals(str.substring(0,1)))
            {
                return o;
            }
        }
        return "";

    }

}
