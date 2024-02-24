public class LastTwo {
    public void lastTwo(String str) {
        if(str.length()>1)
        {
            char a = str.charAt(str.length()-2);
            char b = str.charAt(str.length()-1);

            System.out.println(str.substring(0,str.length()-2)+String.valueOf(b)+String.valueOf(a));
        }
        else
        {
            System.out.println(str);
        }
    }

}
