public class WithoutX {
    public void withoutX(String str) {
        if(str.length()>1 && str.substring(0,1).equals("x") && str.substring(str.length()-1,str.length()).equals("x"))
        {
            System.out.println( str.substring(1,str.length()-1));
        }
        else if(str.length()>0 && str.substring(0,1).equals("x"))
        {
            System.out.println( str.substring(1,str.length()));
        }
        else if(str.length()>0 && str.substring(str.length()-1,str.length()).equals("x"))
        {
            System.out.println( str.substring(0,str.length()-1));
        }
        else
        {
            System.out.println(str);
        }
    }

}
