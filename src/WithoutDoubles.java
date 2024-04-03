public class WithoutDoubles {
    public void withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles == true)
        {
            if(die1 == die2)
            {
                if(die1 == 6)
                {
                    die1 = 1;
                    System.out.println(die1 + die2);
                }
                else
                {
                    die1++;
                    System.out.println(die1 + die2);
                }
            }
            else
            {
                System.out.println(die1 + die2);
            }
        }
        else
        {
            System.out.println(die1 + die2);
        }
    }

}
