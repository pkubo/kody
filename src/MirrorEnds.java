public class MirrorEnds {
    public void mirrorEnds(String string) {
        String result = "";
        for(int i = 0;i<string.length();i++)
        {
            if(string.charAt(i)==string.charAt(string.length()-1-i))
            {
                result = result + String.valueOf(string.charAt(i));
            }
            else
            {
                break;
            }
        }
        System.out.println(result);
    }

}
