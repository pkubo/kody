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


        /*
        Given a string and a non-negative int n, return a larger string that is n copies of the original string.
        */
        //StringTimes ob1 = new StringTimes();
        //ob1.stringTimes("hello ", 5);

        /*
        Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
        or whatever is there if the string is less than length 3. Return n copies of the front;
         */
        //FrontTimes ob1 = new FrontTimes();
        //ob1.frontTimes("hello",5);

        /*
        Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
         */
        //CountXX ob1 = new CountXX();
        //ob1.countXX("korxxelexxpkx");

        /*
        Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
         */
        //DoubleX ob1 = new DoubleX();
        //ob1.doubleX("axxbb");

        /*
        Given a string, return a new string made of every other char starting with the first
         */
        //StringBits ob1 = new StringBits();
        //ob1.stringBits("hello");

        /*
        Given a non-empty string like "Code" return a string like "CCoCodCode".
         */
        //StringSplosion ob1 = new StringSplosion();
        //ob1.stringSplosion("code");

        /*
        Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string
         */
        //Last2 ob1 = new Last2();
        //ob1.last2("xaxxaxaxx");

        /*
        Given an array of ints, return the number of 9's in the array.
         */
        //ArrayCount9 ob1 = new ArrayCount9();
        //ob1.arrayCount9(new int []{1, 9, 9, 3, 7});

        /*
        Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
         */
        //ArrayFront9 ob1 = new ArrayFront9();
        //ob1.arrayFront9(new int[]{1, 2, 3, 4, 5});

        /*
        Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
         */
        //Array123 ob1 = new Array123();
        //ob1.array123(new int[]{1, 1, 2, 4, 1});

        /*
        Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
        So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
         */
        //StringMatch ob1 = new StringMatch();
        //ob1.stringMatch("xxcaazz", "xxbaaz");

        /*
        Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
         */
        //StringX ob1 = new StringX();
        //ob1.stringX("xxHxix");

        /*
        Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...
         */
        //AltPairs ob1 = new AltPairs();
        //ob1.altPairs("kitten");

        /*
        Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.
         */
        //StringYak ob1 = new StringYak();
        //ob1.stringYak("yak123ya");

        /*
        Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.
         */
        //Array667 ob1 = new Array667();
        //ob1.array667(new int[]{6,6,2});

        /*
        Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
         */
        //NoTriples ob1 = new NoTriples();
        //ob1.noTriples(new int[]{1,1,2,2,2,1});

        /*
        Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1.
        Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
         */
        //Has271 ob1 = new Has271();
        //ob1.has271(new int[]{1,2,7,1});

        /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
         */
        //HelloName ob1 = new HelloName();
        //ob1.helloName("Bob");

        /*
        Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
         */
        //MakeAbba ob1 = new MakeAbba();
        //ob1.makeAbba("Hi","Bye");

        /*
        The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
         */
        //MakeTags ob1 = new MakeTags();
        //ob1.makeTags("i","yak");

        /*
        Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>".
         */
        //MakeOutWord ob1 = new MakeOutWord();
        //ob1.makeOutWord("<<>>","Yay");

        /*
        Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
         */
        //ExtraEnd ob1 = new ExtraEnd();
        //ob1.extraEnd("hello");

        /*
        Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is,
        so "X" yields "X", and the empty string "" yields the empty string "".
         */
        //FirstTwo ob1 = new FirstTwo();
        //ob1.firstTwo("Hello");

        /*
        Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
         */
        //FirstHalf ob1 = new FirstHalf();
        //ob1.firstHalf("WooHoo");

        /*
        Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.
         */
        //WithoutEnd ob1 = new WithoutEnd();
        //ob1.withoutEnd("Hello");

        /*
        Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.
        The strings will not be the same length, but they may be empty
         */
        //ComboString ob1 = new ComboString();
        //ob1.comboString("Hello", "Hi");

        /*
        Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
         */
        //NonStart ob1 = new NonStart();
        //ob1.nonStart("hello","there");

        /*
        Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
         */
        //Left2 ob1 = new Left2();
        //ob1.left2("Hello");

        /*
        Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
         */
        //Right2 ob1 = new Right2();
        //ob1.right2("Hello");

    }
}