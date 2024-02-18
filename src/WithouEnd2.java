public class WithouEnd2 {
    public void withouEnd2(String str) {
        if(str.length()>1)
        {
            str = str.substring(1,str.length()-1);
            System.out.println(str);
        }
        System.out.println("");
    }
}
