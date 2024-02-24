public class Without2 {
    public void without2(String str) {
        if(str.length()>1 && str.substring(str.length()-2,str.length()).equals(str.substring(0,2)))
        {
            System.out.println(str.substring(2,str.length()));
        }
        else
        {
            System.out.println(str);
        }
    }

}
