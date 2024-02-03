public class StringSplosion {
    public void stringSplosion(String str) {
        String result= "";
        for(int i = 0;i<=str.length();i++)
        {
            result =result + str.substring(0,i);
        }
        System.out.println(result);
    }

}
