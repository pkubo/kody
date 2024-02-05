public class StringX {
    public void stringX(String str) {
        String result = "";
        for(int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)!='x'|| i==0 || i == str.length()-1)
            {
                result=result +str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
