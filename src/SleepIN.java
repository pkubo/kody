    public class SleepIN {
        public static boolean sleepIN(boolean weekday, boolean vacation) {
            if(weekday == false || vacation == true)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
