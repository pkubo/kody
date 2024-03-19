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

        /*
        Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.
         */
        //TheEnd ob1 = new TheEnd();
        //ob1.theEnd("Hello",true);

        /*
        Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
         */
        //WithouEnd2 ob1 = new WithouEnd2();
        //ob1.withouEnd2("Hello");

        /*
        Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
         */
        //MiddleTwo ob1 = new MiddleTwo();
        //ob1.middleTwo("string");

        /*
        Given a string, return true if it ends in "ly".
         */
        //EndsLy ob1 = new EndsLy();
        //ob1.endsLy("oddly");

        /*
        Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
         */
        //NTwice ob1 = new NTwice();
        //ob1.nTwice("hello",2);

        /*
        Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
         */
        //TwoChar ob1 = new TwoChar();
        //ob1.twoChar("java",3);

        /*
        Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
         */
        //MiddleThree ob1 = new MiddleThree();
        //ob1.middleThree("Candy");

        /*
        Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
         */
        //HasBad ob1 = new HasBad();
        //ob1.hasBad("badxx");

        /*
        Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
         */
        //AtFirst ob1 = new AtFirst();
        //ob1.atFirst("hello");

        /*
        Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
         */
        //LastChars ob1 =new LastChars();
        //ob1.lastChars("last","chars");

        /*
        Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
         */
        //ConCat ob1 = new ConCat();
        //ob1.conCat("abc","cat");

        /*
        Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
         */
        //LastTwo ob1 = new LastTwo();
        //ob1.lastTwo("coding");

        /*
        Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
         */
        //SeeColor ob1 = new SeeColor();
        //ob1.seeColor("redxx");

        /*
        Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
         */
        //FrontAgain ob1 = new FrontAgain();
        //ob1.frontAgain("edited");

        /*
        Given two strings, append them together and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
         */
        //MinCat ob1 = new MinCat();
        //ob1.minCat("Hello","hi");

        /*
        Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
         */
        //ExtraFront ob1 = new ExtraFront();
        //ob1.extraFront("Hello");

        /*
        Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
         */
        //Without2 ob1 = new Without2();
        //ob1.without2("HelloHe");

        /*
        Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
         */
        //DeFront ob1 = new DeFront();
        //ob1.deFront("Hello");

        /*
        Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
         */
        //StartWord ob1 = new StartWord();
        //ob1.startWord("hippo","hi");

        /*
        Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
         */
        //WithoutX ob1 = new WithoutX();
        //ob1.withoutX("xHix");

        /*
        Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
         */
        //WithoutX2 ob1 = new WithoutX2();
        //ob1.withoutX2("xHi");

        /*
        Given a string, return a string where for every char in the original, there are two chars.
         */
        //DoubleChar ob1 = new DoubleChar();
        //ob1.doubleChar("The");

        /*
        Return the number of times that the string "hi" appears anywhere in the given string.
         */
        //CountHi ob1 = new CountHi();
        //ob1.countHi("abc hi ho");

        /*
        Return true if the string "cat" and "dog" appear the same number of times in the given string.
         */
        //CatDog ob1 = new CatDog();
        //ob1.catDog("catdog");

        /*
        Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
         */
        //CountCode ob1 = new CountCode();
        //ob1.countCode("aaaaaacodebbb");

        /*
        Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences
         */
        //EndOther ob1 = new EndOther();
        //ob1.endOther("Hiabc","abc");

        /*
        Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
         */
        //XyzThere ob1 = new XyzThere();
        //ob1.xyzThere("abcxyz");

        /*
        Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
         */
        //BobThere ob1 = new BobThere();
        //ob1.bobThere("abcbob");

        /*
        We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
         */
        //XyBalance ob1 = new XyBalance();
        //ob1.xyBalance("aaxbby");

        /*
        Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
         */
        //MixString ob1 = new MixString();
        //ob1.mixString("abc" , "xyz");

        /*
        Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
         */
        //RepeatEnd ob1 = new RepeatEnd();
        //ob1.repeatEnd("Hello",3);

        /*
        Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
         */
        //RepeatFront ob1 = new RepeatFront();
        //ob1.repeatFront("hello",4);

        /*
        Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
         */
        //RepeatSeparator ob1 = new RepeatSeparator();
        //ob1.repeatSeparator("word","x",3);

        /*
        Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
         */
        //PrefixAgain ob1 = new PrefixAgain();
        //ob1.prefixAgain("abcXYabc",1);

        /*
        Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
         */
        //XyzMiddle ob1 = new XyzMiddle();
        //ob1.xyzMiddle("AAxyzBB");

        /*
        A sandwich is two pieces of bread with something in between. Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
         */
        //GetSandwich ob1 = new GetSandwich();
        //ob1.getSandwich("breadjambread");

        /*
        Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
         */
        //SameStarChar ob1 = new SameStarChar();
        //ob1.sameStarChar("xy*yzz");

        /*
        Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
         */
        //OneTwo ob1 = new OneTwo();
        //ob1.oneTwo("abc");

        /*
        Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
         */
        //ZipZap ob1 = new ZipZap();
        //ob1.zipZap("zipXzap");

        /*
        Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
         */
        //StarOut ob1 = new StarOut();
        //ob1.starOut("ab*cd");

        /*
        Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.
         */
        //PlusOut ob1 = new PlusOut();
        //ob1.plusOut("12xy34","xy");

        /*
        Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
         */
        //WordEnds ob1 = new WordEnds();
        //ob1.wordEnds("abcXY123XYijk", "XY");

        /*
        Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
         */
        //CountYZ ob1 = new CountYZ();
        //ob1.countYZ("fez day");

        /*
        Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
         */
        //WithoutString ob1 = new WithoutString();
        //ob1.withoutString("Hello there","llo");

        /*
        Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).
         */
        //EqualIsNot ob1 = new EqualIsNot();
        //ob1.equalIsNot("This is not");

        /*
        We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.
         */
        //GHappy ob1 = new GHappy();
        //ob1.gHappy("xxggxx");

        /*
        We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string. The triples may overlap.
         */
        //CountTriple ob1 = new CountTriple();
        //ob1.countTriple("abcXXXabc");

        /*
        Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string.
         */
        //SumDigits ob1 = new SumDigits();
        //ob1.sumDigits("aa1bc2d3");






    }
}