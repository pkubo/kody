public class EndOther {
    public void endOther(String a, String b) {

        if(a.substring(a.length()-Math.min(a.length(), b.length()),a.length()).toLowerCase().equals(b.substring(b.length()-Math.min(a.length(), b.length()),b.length()).toLowerCase()))
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
