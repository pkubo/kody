public class FrontAgain {
    public void frontAgain(String str) {
        if(str.length()>1 && str.substring(0,2).equals(str.substring(str.length()-2,str.length())))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
