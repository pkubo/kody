public class CountXX {
    void countXX(String str) {
        int dl=str.length();
        int l =0;
        for(int i = 1;i<dl;i++)
        {
            if(str.charAt(i) == 'x' && str.charAt(i-1)=='x')
            {
                l = l+1;
            }
        }
        System.out.println(l);
    }
}
