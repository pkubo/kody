public class NearTen {
    public void nearTen(int num) {
        if(num%10 ==1 || num%10 ==2 || num%10 == 0 || (num+1)%10 == 0 || (num+2)%10 == 0)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
