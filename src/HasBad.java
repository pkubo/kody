public class HasBad {
    public void hasBad(String str) {
        boolean t = false;
        if(str.length()>3 || str.equals("bad"))
        {
            if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))
            {
                t = true;
            }
        }
        System.out.println(t);
    }

}
