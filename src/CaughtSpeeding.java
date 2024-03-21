public class CaughtSpeeding {
    public void caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday == true)
        {
            if(speed - 5 >= 81)
            {
                System.out.println(2);
            }
            else if(speed - 5 >= 61 && speed - 5 <= 80)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
        else
        {
            if(speed >= 81)
            {
                System.out.println(2);
            }
            else if(speed  >= 61 && speed - 5 <= 80)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
    }

}
