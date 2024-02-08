public class FirstTwo {
    public void firstTwo(String str) {
        if(str.length()==0)
        {
            System.out.println("");
        }
        else if(str.length()<2)
        {
            System.out.println(str);
        }
        else
        {
            String front =str.substring(0,2);
            System.out.println(front);
        }
    }

}
