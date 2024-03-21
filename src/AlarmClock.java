public class AlarmClock {
    public void alarmClock(int day, boolean vacation) {
        String result = "";
        if(vacation == true)
        {
            if(day == 0 || day == 6)
            {
                result = "off";
            }
            else
            {
                result = "10:00";
            }
        }
        else
        {
            if(day == 0 || day == 6)
            {
                result = "10:00";
            }
            else
            {
                result = "7:00";
            }
        }
        System.out.println(result);
    }

}
