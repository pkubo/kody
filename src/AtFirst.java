public class AtFirst {
    public void atFirst(String str) {
        if(str.length()>=2)
        {
            System.out.println(str.substring(0,2));
        }
        else
        {
            System.out.println(String.format("%-2s", str + "@").replace(' ', '@'));
        }

    }

}
