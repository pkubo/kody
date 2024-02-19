public class EndsLy {
    public void endsLy(String str) {
        if(str.length()>1)
        {
            String back = str.substring(str.length()-2,str.length());
            if(back.equals("ly"))
            {
                System.out.println(true);
            }
        }
        else
            System.out.println(false);
    }

}
