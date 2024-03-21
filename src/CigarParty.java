public class CigarParty {
    public void cigarParty(int cigars, boolean isWeekend) {
        if((cigars >=40 && cigars <= 60 && isWeekend == false) || (cigars >=40 && isWeekend == true))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
