public class DeFront {
    public void deFront(String str) {
        if(str.length()>1 && str.substring(0,1).equals("a") && str.substring(1,2).equals("b"))
        {
            System.out.println(str);
        }
        else if(str.length()>1 && str.substring(0,1).equals("a"))
        {
            System.out.println(str.substring(0,1)+str.substring(2,str.length()));
        }
        else if(str.length()>1 && str.substring(1,2).equals("b"))
        {
            System.out.println(str.substring(1,str.length()));
        }
        else
        {
            System.out.println(str.substring(2,str.length()));
        }
    }

}
