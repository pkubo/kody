public class TheEnd {
    public void theEnd(String str, boolean front) {
        if(front == true)
        {
            str = str.substring(0,1);
            System.out.println(str);
        }
        else
        {
            str = str.substring(str.length()-1,str.length());
            System.out.println(str);
        }
    }
}
