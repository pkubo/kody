public class SeeColor {
    public void seeColor(String str) {
        if(str.length()>2 && str.substring(0,3).equals("red"))
        {
            System.out.println("red");
        }
        else if(str.length()>3 && str.substring(0,4).equals("blue"))
        {
            System.out.println("blue");
        }
        else
        {
            System.out.println("");
        }
    }
}
