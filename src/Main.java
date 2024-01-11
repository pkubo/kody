public class Main {
    public static void main(String[] args) {
        /*
        The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
         */
       // System.out.println(SleepIN.sleepIN(true, false));

        /*
        We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
        We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
         */
        //System.out.println(MonkeyTrouble.monkeyTrouble(true,false));

        /*
        Given two int values, return their sum. Unless the two values are the same, then return double their sum.
         */
        //System.out.println(SumDouble.sumDouble(15,26));

        /*
        Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
         */
        //System.out.println(Diff21.diff21(25));

        /*
        We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
        We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
         */
        //System.out.println(ParrotTrouble.parrotTrouble(true,14));

        /*
        Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
         */
        //System.out.println(Makes10.makes10(6,4));

        /*
        Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
         */
        //System.out.println(NearHundred.nearHundred(88));

        /*
        Given 2 int values, return true if one is negative and one is positive.
        Except if the parameter "negative" is true, then return true only if both are negative.
         */
        //System.out.println(PosNeg.posNeg(5,-12,false));

        /*
        Given a string, return a new string where "not " has been added to the front.
        However, if the string already begins with "not", return the string unchanged.
         */
        //System.out.println(NotString.notString("hello"));

        /*
        Given a non-empty string and an int n, return a new string where the char at index n has been removed.
        The value of n will be a valid index of a char in the original string.
         */
        //System.out.println(MissingChar.missingChar("hello",3));

        /*
        Given a string, return a new string where the first and last chars have been exchanged.
         */
        //System.out.println(FrontBack.frontBack("code"));

        /*
        Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there.
        Return a new string which is 3 copies of the front.
         */
        //System.out.println(Front3.front3("java"));

        /*
        Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
        The original string will be length 1 or more.
         */
        //System.out.println(BackAround.backAround("cat"));

        /*
        Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
         */
        //System.out.println(Or35.or35(33));

        /*
        Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
        If the string length is less than 2, use whatever chars are there.
         */
        //System.out.println(Front22.front22("world"));

        /*
        Given a string, return true if the string starts with "hi" and false otherwise.
         */
        //System.out.println(StartHi.startHi("world"));

        /*
        Given two temperatures, return true if one is less than 0 and the other is greater than 100.
         */
        //System.out.println(IcyHot.icyHot(120,-15));

        /*
        Given 2 int values, return true if either of them is in the range 10..20 inclusive.
         */
        //System.out.println(In1020.in1020(12,99));

        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive.
        Given 3 int values, return true if 1 or more of them are teen.
         */
        //System.out.println(HasTenn.hasTeen(13,20,10));

        /*
        We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
        return true if one or the other is teen, but not both.
         */
        //System.out.println(LoneTeen.loneTeen(13,99));

        /*
        Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
        Otherwise, return the string unchanged.
         */
        //System.out.println(DelDel.delDel("adelbc"));

        /*
        Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
         */
        //System.out.println(MixStart.mixStart("pix snacks"));

        /*
        Given a string, return a string made of the first 2 chars (if present),
        however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
         */
        //System.out.println(StartOz.startOz("bzoo"));

        /*
        Given three int values, a b c, return the largest.
         */
        //System.out.println(IntMax.intMax(1,2,3));

        /*
        Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
         */
        //System.out.println(Close10.close10(5,12));

        /*
        Given 2 int values, return true if they are both in the range 30..40 inclusive,
        or they are both in the range 40..50 inclusive.
        */
        //System.out.println(In3050.in3050(31,30));

        /*
        Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
         */

        //System.out.println(Max1020.max1020(15,28));

        /*
        Return true if the given string contains between 1 and 3 'e' chars.
         */

        //System.out.println(StringE.stringE("Hello"));

        /*
        Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57.
         */

        //System.out.println(LastDigit.lastDigit(16,86));

        /*
        Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there.
         */

        //System.out.println(EndUp.endUp("Hello"));

        /*
        Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
        So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
         */

        //System.out.println(EveryNth.everyNth("Hello",2));
    }
}