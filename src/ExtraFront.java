public class ExtraFront {
    public void extraFront(String str) {
        if(str.length()>1)
        {
            System.out.println(str.substring(0,2)+str.substring(0,2)+str.substring(0,2));
        }
        else
        {
            System.out.println(str+str+str);
        }
    }

}
