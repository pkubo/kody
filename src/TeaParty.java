public class TeaParty {
    public void teaParty(int tea, int candy) {
        if(tea<5 || candy <5)
        {
            System.out.println(0);
        }
        else if(2 * tea <= candy || candy *2 <= tea)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }

}
