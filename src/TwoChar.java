public class TwoChar {
    public void twoChar(String str, int index) {

        if(str.length()-2>=index && index> 0)
        {
            str = str.substring(index,index+2);
            System.out.println(str);
        }
        else
        {
            str = str.substring(0,2);
            System.out.println(str);
        }
    }
}
