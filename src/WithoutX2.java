public class WithoutX2 {
    public void withoutX2(String str) {
        if(str.length()>1 && str.substring(0,2).equals("xx"))
        {
            System.out.println( str.substring(2,str.length()));
        }
        else if(str.length()>0 && str.substring(0,1).equals("x"))
        {
            System.out.println(str.substring(1,str.length()));
        }
        else if(str.length()>1 && str.substring(1,2).equals("x"))
        {
            System.out.println(str.substring(0,1) + str.substring(2,str.length()));
        }
        else
        {
            System.out.println(str);
        }
    }

}
