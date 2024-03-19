public class SumDigits {
    public void sumDigits(String str) {
        int result =0;
        for(int i = 0; i< str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                int w  = Integer.parseInt(str.substring(i,i+1));
                result = result + w;

            }
        }
        System.out.println(result);
    }
}
