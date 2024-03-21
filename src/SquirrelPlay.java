public class SquirrelPlay {
    public void squirrelPlay(int temp, boolean isSummer) {
        if((temp>=60 && temp<=90 && isSummer == false) || (temp>=60 && temp<=100 && isSummer == true))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
