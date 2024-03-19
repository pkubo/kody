public class CountYZ {
    public void countYZ(String str) {
        int k = 0;
        str = str.toLowerCase();
        for(int i = 0;i<str.length()-1;i++)
        {
            if(Character.isLetter(str.charAt(i+1)))
            {

            }
            else
            {
                if(str.charAt(i)=='y'||str.charAt(i)=='z')
                {
                    k++;
                }
            }
        }
        if(str.charAt(str.length()-1)=='y'|| str.charAt(str.length()-1)=='z')
        {
            k++;
        }
        System.out.println(k);
    }

}
