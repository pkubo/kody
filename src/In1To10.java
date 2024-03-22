public class In1To10 {
    public void in1To10(int n, boolean outsideMode) {
        if((outsideMode == false && n >= 1 && n<= 10) || ((outsideMode == true && n <= 1) || (outsideMode == true && n>= 10)))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
