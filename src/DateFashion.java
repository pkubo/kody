public class DateFashion {
    public void dateFashion(int you, int date) {
        if(you <= 2 || date <= 2)
        {
            System.out.println(0);
        }
        else if(you >= 8 || date >= 8)
        {
            System.out.println(2);
        }
        else
        {
            System.out.println(1);
        }
    }

}
