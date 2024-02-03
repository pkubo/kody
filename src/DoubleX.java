public class DoubleX {
    void doubleX(String str) {
        boolean t = false;
        for(int i = 1;i<str.length();i++)
        {
            if(str.charAt(i) == 'x' && str.charAt(i-1)=='x')
            {
                t = true;
                break;
            }
            else if(str.charAt(i) != 'x' && str.charAt(i-1)=='x')
            {
                t = false;
                break;
            }
        }

        System.out.println(t);
    }

}
