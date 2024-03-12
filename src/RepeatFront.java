public class RepeatFront {
    public void repeatFront(String str, int n) {
        String result = "";
        for(int i = 0; i<n;i++)
        {
            result = result + str.substring(0,n-i);
        }
        System.out.println(result);
    }
}
