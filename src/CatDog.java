public class CatDog {
    public void catDog(String str) {
        int d = 0;
        int c = 0;
        for(int i = 0;i<str.length()-2;i++)
        {
            if(str.substring(i,i+3).equals("dog"))
            {
                d++;
            }
            else if(str.substring(i,i+3).equals("cat"))
            {
                c++;
            }
        }
        if(c == d)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
