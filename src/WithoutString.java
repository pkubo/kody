public class WithoutString {
    public void withoutString(String base, String remove) {
        String result ="";
        int w = 0;
        for(int i = 0; i<=base.length()-remove.length();i++)
        {
            if(base.toLowerCase().substring(i,i+remove.length()).equals(remove.toLowerCase()))
            {

                i = i + remove.length() -1;


            }
            else
            {
                result = result + String.valueOf(base.charAt(i));
            }
            w = i + 1;
        }
        System.out.println(result + base.substring(w,base.length()));
    }

}
