public class FizzString {
    public void fizzString(String str) {
        if(str.startsWith("f") && str.endsWith("b") )
        {
            System.out.println("FizzBuzz");
        }
        else if(str.startsWith("f"))
        {
            System.out.println("Fizz");
        }
        else if(str.endsWith("b") )
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(str);
        }
    }

}
