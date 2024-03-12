public class XyzMiddle {
    public void xyzMiddle(String str) {
        int length = str.length();

        if (length < 3) {
            System.out.println(false);
        }

        for (int i = 0; i <= length - 3; i++)
        {
            if (str.substring(i, i + 3).equals("xyz"))
            {
                int leftLength = i;
                int rightLength = length - (i + 3);

                if (Math.abs(leftLength - rightLength) <= 1)
                {
                    System.out.println(true);
                }
            }
        }


    }
}
