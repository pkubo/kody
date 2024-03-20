public class NotReplace {
    public void notReplace(String str) {
        String result = "";
        for(int i = 0;i<=str.length()-1;i++)
        {
            if(i < str.length()-2 && str.substring(i,i+2).equals("is"))
            {
                if(Character.isLetter(str.charAt(i+2)))
                {
                    result = result + str.substring(i,i+2);
                }
                else if(i > 0 && Character.isLetter(str.charAt(i-1)))
                {
                    result = result + str.substring(i,i+2) + " ";
                    i++;
                }
                else
                {
                    result = result + str.substring(i,i+2) + " not";
                }
                i++;
            }
            else
            {
                result = result + String.valueOf(str.charAt(i));
            }

        }
        if(result.length()-3 >= 0 && Character.isLetter(result.charAt(result.length()-3)))
        {

        }
        else if(result.length()-2 >= 0 && result.substring(result.length()-2,result.length()).equals("is"))
        {
            result = result + " not";
        }
        System.out.println(result);
    }

}
