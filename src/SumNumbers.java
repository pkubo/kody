public class SumNumbers {
    public void sumNumbers(String str) {
        String licz = "";
        int sum = 0;
        int w = 0;
        for(int i = 0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                licz = licz + String.valueOf(str.charAt(i));
                if(i<str.length()-1 && Character.isDigit(str.charAt(i+1)))
                {

                }
                else
                {
                    w  = Integer.parseInt(licz);
                    sum = sum + w;
                }
            }
            else
            {
                licz ="";
            }
        }
        System.out.println(sum);
    }

}
