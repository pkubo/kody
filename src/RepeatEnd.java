public class RepeatEnd {
    public void repeatEnd(String str, int n) {
        String result = "";
        for(int i = 0;i<n;i++)
        {
            result = result + str.substring(str.length()-n,str.length());
        }
        System.out.println(result);
    }
}
