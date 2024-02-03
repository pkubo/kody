public class StringBits {
    public void stringBits(String str) {
        String result = "";
        for(int i = 0; i< str.length();i= i + 2)
        {
            result=result +str.charAt(i);
        }
       System.out.println(result);
    }

}
